DESCRIPTION = "Coyote Linux base tasks"

PR = "r3"

inherit task

DEPENDS = ""
PROVIDES = "${PACKAGES}"
PACKAGES = ' \
	    task-coyote-base \
            task-coyote-base-extended \
            task-distro-coyote-base \
            task-machine-coyote-base \
            \
            '

#
# packages which content depend on MACHINE_FEATURES need to be MACHINE_ARCH
#
PACKAGE_ARCH = "${MACHINE_ARCH}"

#
# those ones can be set in machine config to supply packages needed to get machine booting
#
MACHINE_ESSENTIAL_EXTRA_RDEPENDS ?= ""
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS ?= ""

#
# task-base contain stuff needed for base system (machine related)
#
RDEPENDS_task-coyote-base = "\
    task-distro-coyote-base \
    task-machine-coyote-base \
    "

RDEPENDS_task-coyote-base-extended = "\
	task-coyote-base \
	bash \
	lighttpd \
	openssl \
	nano \
	iptables \
	iptstate \
	iputils \
	iproute2 \
	ipsec-tools \
	dnsmasq \
	poptop \
	openvpn \
	haproxy \
	mono \
	sysfsutils \
	module-init-tools \
	pciutils \
	"

#
# packages added by distribution
#
DEPENDS_task-distro-coyote-base = "${DISTRO_EXTRA_DEPENDS}"
RDEPENDS_task-distro-coyote-base = "${DISTRO_EXTRA_RDEPENDS}"
RRECOMMENDS_task-distro-coyote-base = "${DISTRO_EXTRA_RRECOMMENDS}"

#
# packages added by machine config
#
RDEPENDS_task-machine-coyote-base = "${MACHINE_EXTRA_RDEPENDS}"
RRECOMMENDS_task-machine-coyote-base = "${MACHINE_EXTRA_RRECOMMENDS}"

