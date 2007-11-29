include erlang.inc

inherit native

SRC_URI += "file://erts-emulator-x86-signal-glibc-2-7.patch;patch=1 \
	   "

# EXTRA_OEMAKE = 'OTP_SMALL_BUILD=true'
EXTRA_OECONF = '--without-ssl'

do_configure() {
    TARGET=${HOST_SYS} \
    ac_cv_prog_javac_ver_1_2=no \
    oe_runconf
}

do_compile_prepend() {
    export TARGET=${HOST_SYS}
}

do_stage_prepend() {
    export TARGET=${HOST_SYS}
}

do_install_prepend() {
    export TARGET=${HOST_SYS}
}
