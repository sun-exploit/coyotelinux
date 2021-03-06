DESCRIPTION = "Python Bindings for the Cairo canvas library"
SECTION = "devel/python"
HOMEPAGE = "http://cairographics.org/pycairo"
LICENSE = "LGPL MPL"
# cairo >= 1.8.0
DEPENDS = "cairo"
PR = "ml0"

DEFAULT_PREFERENCE = "-1"

SRC_URI = "http://cairographics.org/releases/pycairo-${PV}.tar.gz \
           file://fix-setup-py.patch;patch=1"
S = "${WORKDIR}/pycairo-${PV}"

inherit distutils pkgconfig

do_configure_append() {
	sed -e 's:@prefix@:${prefix}:' -e 's:@includedir@:\$\{prefix\}/include:' -e 's:@VERSION@:${PV}:' pycairo.pc.in > pycairo.pc
}

do_stage() {
	install -d ${STAGING_INCDIR}
	install -m 0644 cairo/pycairo.h ${STAGING_INCDIR}
}
