# HAProxy from haproxy.1wt.eu
DESCRIPTION = "A TCP/HTTP load balancer"
HOMEPAGE = "http://haproxy.1wt.eu/"
SECTION = "console/network"
PRIORITY = "optional"
LICENSE = "GPL"
PR = "r1"

SRC_URI = "http://haproxy.1wt.eu/download/1.3/src/haproxy-1.3.17.tar.gz"
SRC_URI += "file://init"
SRC_URI += "file://haproxy.conf"
SRC_URI += "file://Makefile.patch;patch=1"

INITSCRIPT_NAME = "haproxy"
# No dependencies, so just go in at the standard level (20)
INITSCRIPT_PARAMS = "defaults"

# The configuration file must be edited...
CONFFILES_${PN} = "${sysconfdir}/haproxy/haproxy.conf"

inherit autotools update-rc.d

PACKAGES += "haproxy"

do_compile() {
    oe_runmake TARGET=linux26 PREFIX=/usr
}

do_install_append() {
	install -d "${D}${sysconfdir}/init.d"
	install -c -m 755 ${WORKDIR}/init "${D}${sysconfdir}/init.d/haproxy"
	install -d "${D}${sysconfdir}/haproxy"
	install -c -m 644 ${WORKDIR}/haproxy.conf "${D}${sysconfdir}/haproxy/haproxy.conf"
}
