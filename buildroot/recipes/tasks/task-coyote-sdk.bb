DESCRIPTION = "Packages required for native (on-device) SDK"
LICENSE = "MIT"

# DEPENDS = "virtual/libc gcc binutils make patch patchutils diffutils automake flex gawk sed grep bison m4"

RDEPENDS = "cpp \
	    gcc-symlinks \
	    g++-symlinks \
	    cpp-symlinks \
	    make \
	    glibc-dev \
	    glib-2.0 \
	    glib-2.0-dev \
	    m4 \
	    strace \
	    task-proper-tools \
	    perl-modules \
	    flex \
	    flex-dev \
	    bison \
	    gawk \
	    sed \
	    grep \
	    autoconf \
	    automake \
	    patch \
	    patchutils \
	    diffutils \
	    libstdc++-dev \
	    pkgconfig \
	    glibc-dbg \
            glibc-utils \
            libsegfault \
            glibc-thread-db \
            glibc-localedata-i18n \
            glibc-gconv-ibm850 \
            glibc-gconv-cp1252 \
            glibc-gconv-iso8859-1 \
            glibc-gconv-iso8859-15 \
            locale-base-en-us \
            linux-libc-headers-dev \
            "

RECOMMENDS = " g77-symlinks gfortran-symlinks "

PR = "r25"

ALLOW_EMPTY = "1"
PACKAGES = "${PN}"
