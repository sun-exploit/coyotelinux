require python-divmodepsilon_${PV}.bb
inherit native

DEPENDS = "python-native python-twisted-native zope-native"

do_stage() {
    BUILD_SYS=${BUILD_SYS} HOST_SYS=${HOST_SYS} \
    STAGING_LIBDIR=${STAGING_LIBDIR} STAGING_INCDIR=${STAGING_INCDIR} \
        ${STAGING_BINDIR}/python setup.py install --prefix=${STAGING_BINDIR}/.. --install-data=${STAGING_DATADIR}
}

