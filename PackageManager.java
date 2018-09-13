    /**
     * if the package is already installed.
     * 程序已经存在
     */
    public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;


    /**
     * if the package archive file is invalid.
     * 无效的APK
     */
    public static final int INSTALL_FAILED_INVALID_APK = -2;


    /**
     * if the URI passed in is invalid.
     * 无效的链接
     */
    public static final int INSTALL_FAILED_INVALID_URI = -3;


    /**
     * if the package manager service found that the device
     *   didn't have enough storage space to install the app.
     * 没有足够的存储空间
     */
    public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;


    /**
     * if a package is already installed with the same name.
     * 已存在同名程序
     */
    public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;


    /**
     * if the requested shared user does not exist.
     * 共享用户不存在
     */
    public static final int INSTALL_FAILED_NO_SHARED_USER = -6;


    /**
     * if a previously installed package of the same name has a different signature
     *   than the new package (and the old package's data was not removed).
     * 更新不兼容
     */
    public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;


    /**
     * if the new package is requested a shared user which is already installed
     *   on the device and does not have matching signature.
     * 共享用户不兼容
     */
    public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;


    /**
     * if the new package uses a shared library that is not available.
     * 共享库已丢失
     */
    public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;


    /**
     * if the new package uses a shared library that is not available.
     * 替换时无法删除
     */
    public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;


    /**
     * if the new package failed while optimizing and validating its dex files,
     *   either because there was not enough storage or the validation failed.
     * 空间不足或验证失败
     */
    public static final int INSTALL_FAILED_DEXOPT = -11;


    /**
     * if the new package failed because the current SDK version is older than
     * that required by the package.
     * 系统版本过旧
     */
    public static final int INSTALL_FAILED_OLDER_SDK = -12;


    /**
     * if the new package failed because it contains a content provider with the
     *   same authority as a provider already installed in the system.
     * 存在同名的内容提供者
     */
    public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;


    /**
     * if the new package failed because the current SDK version is newer than
     *   that required by the package.
     * 系统版本过新
     */
    public static final int INSTALL_FAILED_NEWER_SDK = -14;


    /**
     * if the new package failed because it has specified that it is a test-only
     *   package and the caller has not supplied the {@link #INSTALL_ALLOW_TEST}
     *   flag.
     * 调用者不被允许测试的测试程序
     */
    public static final int INSTALL_FAILED_TEST_ONLY = -15;


    /**
     * if the package being installed contains native code, but none that is
     *   compatible with the the device's CPU_ABI.
     * 包含的本机代码不兼容CPU_ABI
     */
    public static final int INSTALL_FAILED_CPU_ABI_INCOMPATIBLE = -16;


    /**
     * if the new package uses a feature that is not available.
     * 使用了一个无效的特性
     */
    public static final int INSTALL_FAILED_MISSING_FEATURE = -17;


// ------ Errors related to sdcard
    /**
     * if a secure container mount point couldn't be accessed on external media.
     * SD卡访问失败
     */
    public static final int INSTALL_FAILED_CONTAINER_ERROR = -18;


    /**
     * if the new package couldn't be installed in the specified install location.
     * 无效的安装路径
     */
    public static final int INSTALL_FAILED_INVALID_INSTALL_LOCATION = -19;


    /**
     * if the new package couldn't be installed in the specified install
     *   location because the media is not available.
     * SD卡不可用
     */
    public static final int INSTALL_FAILED_MEDIA_UNAVAILABLE = -20;


    /**
     * if the new package couldn't be installed because the verification timed out.
     * 验证超时
     */
    public static final int INSTALL_FAILED_VERIFICATION_TIMEOUT = -21;


    /**
     * if the new package couldn't be installed because the verification did not succeed.
     * 验证失败
     */
    public static final int INSTALL_FAILED_VERIFICATION_FAILURE = -22;


    /**
     * if the package changed from what the calling program expected.
     * 预期的应用被改变
     */
    public static final int INSTALL_FAILED_PACKAGE_CHANGED = -23;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package is assigned a different UID than it previously held.
     * @hide
     */
    public static final int INSTALL_FAILED_UID_CHANGED = -24;

    /**
     * Installation return code: this is passed to the {@link IPackageInstallObserver} by
     * {@link #installPackage(android.net.Uri, IPackageInstallObserver, int)} if
     * the new package has an older version code than the currently installed package.
     * @hide
     */
    public static final int INSTALL_FAILED_VERSION_DOWNGRADE = -25;



    /**
     * if the parser was given a path that is not a file, or does not end
     *   with the expected '.apk' extension.
     * 解析失败，不是APK
     */
    public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;


    /**
     * if the parser was unable to retrieve the AndroidManifest.xml file.
     * 解析失败，无法提取Manifest 。  设备证书与签名证书不一致
     */
    public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;


    /**
     * if the parser encountered an unexpected exception.
     * 解析失败，无法预期的异常
     */
    public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;


    /**
     * if the parser did not find any certificates in the .apk.
     * 解析失败，找不到证书   未签名
     */
    public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;


    /**
     * if the parser found inconsistent certificates on the files in the .apk.
     * 解析失败，证书不一致   前后签名不一致
     */
    public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;


    /**
     * if the parser encountered a CertificateEncodingException in one of the
     *   files in the .apk.
     * 解析失败，证书编码异常
     */
    public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;


    /**
     * if the parser encountered a bad or missing package name in the manifest.
     * 解析失败，manifest中的包名错误或丢失
     */
    public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;


    /**
     * if the parser encountered a bad shared user id name in the manifest.
     * 解析失败，manifest中的共享用户错误
     */
    public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;


    /**
     * if the parser encountered some structural problem in the manifest.
     * 解析失败，manifest中出现结构性错误
     */
    public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;


    /**
     * if the parser did not find any actionable tags (instrumentation or application)
     *   in the manifest.
     * 解析失败，manifest中没有actionable tags
     */
    public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;


    /**
     * if the system failed to install the package because of system issues.
     * 系统问题导致安装失败
     */
    public static final int INSTALL_FAILED_INTERNAL_ERROR = -110;
