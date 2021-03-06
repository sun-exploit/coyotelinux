SECTION = "base"
require e2tools_${PV}.bb
inherit native

DEPENDS = "e2fsprogs-libs-native e2fsprogs-native"
FILESPATH = "${@base_set_filespath([ '${FILE_DIRNAME}/e2tools-${PV}', '${FILE_DIRNAME}/e2tools', '${FILE_DIRNAME}/files', '${FILE_DIRNAME}' ], d)}"
PACKAGES = ""

e2links = "e2ln e2ls e2mkdir e2mv e2rm e2tail"
do_stage () {
	install -m 0755 e2cp ${STAGING_BINDIR}/
	for i in ${e2links}; do
		ln -sf e2cp ${STAGING_BINDIR}/$i
	done
}
