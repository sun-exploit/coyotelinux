DESCRIPTION = "Image for Coyote Linux development testing"
PR = "r8"
LICENSE = "GPL"

inherit task

DEVIMAGE_EXTRA_RDEPENDS ?= ""
DEVIMAGE_EXTRA_RRECOMMENDS ?= ""

RDEPENDS = "\
	task-coyote-base-extended \
	task-native-sdk \
	perl \
    ${DEVIMAGE_EXTRA_RDEPENDS} \
    "

RRECOMMENDS = "\
    kernel \
    kernel-image \
    kernel-module-msdos \
    kernel-module-vfat \
    kernel-modules \
    ${DEVIMAGE_EXTRA_RRECOMMENDS} \
    "
PACKAGE_ARCH = "${MACHINE_ARCH}"
