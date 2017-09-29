    /**
     * if the package is already installed.
     * �����Ѿ�����
     */
    public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;


    /**
     * if the package archive file is invalid.
     * ��Ч��APK
     */
    public static final int INSTALL_FAILED_INVALID_APK = -2;


    /**
     * if the URI passed in is invalid.
     * ��Ч������
     */
    public static final int INSTALL_FAILED_INVALID_URI = -3;


    /**
     * if the package manager service found that the device
     *   didn't have enough storage space to install the app.
     * û���㹻�Ĵ洢�ռ�
     */
    public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;


    /**
     * if a package is already installed with the same name.
     * �Ѵ���ͬ������
     */
    public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;


    /**
     * if the requested shared user does not exist.
     * �����û�������
     */
    public static final int INSTALL_FAILED_NO_SHARED_USER = -6;


    /**
     * if a previously installed package of the same name has a different signature
     *   than the new package (and the old package's data was not removed).
     * ���²�����
     */
    public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;


    /**
     * if the new package is requested a shared user which is already installed
     *   on the device and does not have matching signature.
     * �����û�������
     */
    public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;


    /**
     * if the new package uses a shared library that is not available.
     * ������Ѷ�ʧ
     */
    public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;


    /**
     * if the new package uses a shared library that is not available.
     * �滻ʱ�޷�ɾ��
     */
    public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;


    /**
     * if the new package failed while optimizing and validating its dex files,
     *   either because there was not enough storage or the validation failed.
     * �ռ䲻�����֤ʧ��
     */
    public static final int INSTALL_FAILED_DEXOPT = -11;


    /**
     * if the new package failed because the current SDK version is older than
     * that required by the package.
     * ϵͳ�汾����
     */
    public static final int INSTALL_FAILED_OLDER_SDK = -12;


    /**
     * if the new package failed because it contains a content provider with the
     *   same authority as a provider already installed in the system.
     * ����ͬ���������ṩ��
     */
    public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;


    /**
     * if the new package failed because the current SDK version is newer than
     *   that required by the package.
     * ϵͳ�汾����
     */
    public static final int INSTALL_FAILED_NEWER_SDK = -14;


    /**
     * if the new package failed because it has specified that it is a test-only
     *   package and the caller has not supplied the {@link #INSTALL_ALLOW_TEST}
     *   flag.
     * �����߲���������ԵĲ��Գ���
     */
    public static final int INSTALL_FAILED_TEST_ONLY = -15;


    /**
     * if the package being installed contains native code, but none that is
     *   compatible with the the device's CPU_ABI.
     * �����ı������벻����CPU_ABI
     */
    public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;


    /**
     * if the new package uses a feature that is not available.
     * ʹ����һ����Ч������
     */
    public static final int INSTALL_FAILED_MISSING_FEATURE = -17;


// ------ Errors related to sdcard
    /**
     * if a secure container mount point couldn't be accessed on external media.
     * SD������ʧ��
     */
    public static final int INSTALL_FAILED_CONTAINER_ERROR = -18;


    /**
     * if the new package couldn't be installed in the specified install location.
     * ��Ч�İ�װ·��
     */
    public static final int INSTALL_FAILED_INVALID_INSTALL_LOCATION = -19;


    /**
     * if the new package couldn't be installed in the specified install
     *   location because the media is not available.
     * SD��������
     */
    public static final int INSTALL_FAILED_MEDIA_UNAVAILABLE = -20;


    /**
     * if the new package couldn't be installed because the verification timed out.
     * ��֤��ʱ
     */
    public static final int INSTALL_FAILED_VERIFICATION_TIMEOUT = -21;


    /**
     * if the new package couldn't be installed because the verification did not succeed.
     * ��֤ʧ��
     */
    public static final int INSTALL_FAILED_VERIFICATION_FAILURE = -22;


    /**
     * if the package changed from what the calling program expected.
     * Ԥ�ڵ�Ӧ�ñ��ı�
     */
    public static final int INSTALL_FAILED_PACKAGE_CHANGED = -23;


    /**
     * if the parser was given a path that is not a file, or does not end
     *   with the expected '.apk' extension.
     * ����ʧ�ܣ�����APK
     */
    public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;


    /**
     * if the parser was unable to retrieve the AndroidManifest.xml file.
     * ����ʧ�ܣ��޷���ȡManifest
     */
    public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;


    /**
     * if the parser encountered an unexpected exception.
     * ����ʧ�ܣ��޷�Ԥ�ڵ��쳣
     */
    public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;


    /**
     * if the parser did not find any certificates in the .apk.
     * ����ʧ�ܣ��Ҳ���֤��
     */
    public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;


    /**
     * if the parser found inconsistent certificates on the files in the .apk.
     * ����ʧ�ܣ�֤�鲻һ��
     */
    public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;


    /**
     * if the parser encountered a CertificateEncodingException in one of the
     *   files in the .apk.
     * ����ʧ�ܣ�֤������쳣
     */
    public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;


    /**
     * if the parser encountered a bad or missing package name in the manifest.
     * ����ʧ�ܣ�manifest�еİ��������ʧ
     */
    public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;


    /**
     * if the parser encountered a bad shared user id name in the manifest.
     * ����ʧ�ܣ�manifest�еĹ����û�����
     */
    public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;


    /**
     * if the parser encountered some structural problem in the manifest.
     * ����ʧ�ܣ�manifest�г��ֽṹ�Դ���
     */
    public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;


    /**
     * if the parser did not find any actionable tags (instrumentation or application)
     *   in the manifest.
     * ����ʧ�ܣ�manifest��û��actionable tags
     */
    public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;


    /**
     * if the system failed to install the package because of system issues.
     * ϵͳ���⵼�°�װʧ��
     */
    public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;