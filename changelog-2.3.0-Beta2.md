## 2.3.0-Beta2

### Analysis API
- [KT-80082](https://youtrack.jetbrains.com/issue/KT-80082) K2. False positive "Cannot resolve method" for self-bounded generic with wildcard return type in Java interop

### Analysis API. Code Compilation
- [KT-70860](https://youtrack.jetbrains.com/issue/KT-70860) K2 IDE / Kotlin Debugger: CCE “java.lang.String cannot be cast to java.lang.Void” on evaluating not-null variable on the line with assigning null to that var

### Analysis API. FIR
- [KT-80473](https://youtrack.jetbrains.com/issue/KT-80473) Add events for tracking LL activities
- [KT-81378](https://youtrack.jetbrains.com/issue/KT-81378) Expected expression 'FirFunctionCallImpl' to be resolved caused by `suspend {}`

### Analysis API. Providers and Caches
- [KT-78882](https://youtrack.jetbrains.com/issue/KT-78882) K2 AA: Calling containingSymbol on getProgressionLastElement causes exception
- [KT-80622](https://youtrack.jetbrains.com/issue/KT-80622) Analysis API: Visualise LL FIR session structure & weight 
- [KT-80904](https://youtrack.jetbrains.com/issue/KT-80904) Analysis API: "Invalid dangling file module" exception during session invalidation
- [KT-80911](https://youtrack.jetbrains.com/issue/KT-80911) Analysis API: Execute session invalidation in a non-cancelable section
- [KT-81242](https://youtrack.jetbrains.com/issue/KT-81242) Analysis API: Add UUID/lifetime properties to LL FIR session structure logging
- [KT-81476](https://youtrack.jetbrains.com/issue/KT-81476) Analysis API: `AlreadyDisposedException` from low-memory cache cleanup

### Analysis API. Standalone
- [KT-81108](https://youtrack.jetbrains.com/issue/KT-81108) AA: java.lang.ClassCastException: class org.jetbrains.kotlin.fir.FirBinaryDependenciesModuleData cannot be cast to class org.jetbrains.kotlin.analysis.low.level.api.fir.projectStructure.LLFirModuleData

### Analysis API. Stubs and Decompilation
- [KT-77097](https://youtrack.jetbrains.com/issue/KT-77097) Support `ReplaceWith` deprecation annotation argument via stubs

### Analysis API. Surface
- [KT-59857](https://youtrack.jetbrains.com/issue/KT-59857) KaExpressionTypeProvider#returnType shouldn't throw an exception for class like declarations
- [KT-70127](https://youtrack.jetbrains.com/issue/KT-70127) Analysis API: 'KaFirReceiverParameterSymbol' does not implement 'KaFirSymbol'; leads to exception from `importableFqName` 
- [KT-79772](https://youtrack.jetbrains.com/issue/KT-79772) Migrate from 'validityAsserted' to 'withValidityAssertion'
- [KT-80084](https://youtrack.jetbrains.com/issue/KT-80084) Provide endpoints for Analysis API to understand when the context sensitive resolution is used
- [KT-81122](https://youtrack.jetbrains.com/issue/KT-81122) Drop KaImportOptimizer
- [KT-81123](https://youtrack.jetbrains.com/issue/KT-81123) Reimplement KaFirSymbolInformationProvider#importableFqName
- [KT-81124](https://youtrack.jetbrains.com/issue/KT-81124) K2: KaSymbolInformationProvider#importableFqName: type alias constructor should have a reference to the type alias and not to the underlying class
- [KT-81125](https://youtrack.jetbrains.com/issue/KT-81125) K2: KaSymbolInformationProvider#importableFqName: should return null for property accessors
- [KT-81126](https://youtrack.jetbrains.com/issue/KT-81126) K2: KaSymbolInformationProvider#importableFqName: should return null for enum entry initializer constructors
- [KT-81127](https://youtrack.jetbrains.com/issue/KT-81127) K2: KaSymbolInformationProvider#importableFqName: should return null for anonymous functions
- [KT-81128](https://youtrack.jetbrains.com/issue/KT-81128) K2: KaSymbolInformationProvider#importableFqName: should return null for error destructuring declarations
- [KT-81129](https://youtrack.jetbrains.com/issue/KT-81129) K2: KaSymbolInformationProvider#importableFqName: should return null for dynamic declarations
- [KT-81132](https://youtrack.jetbrains.com/issue/KT-81132) Use KaSession instead of a particular KaSessionComponent for context parameter bridges

### Backend. JS
- [KT-74055](https://youtrack.jetbrains.com/issue/KT-74055) KJS: @JsPlainObject adds JS code even if marked interface is not used
- [KT-79222](https://youtrack.jetbrains.com/issue/KT-79222) K/JS: Allow using Long in exported declarations
- [KT-79928](https://youtrack.jetbrains.com/issue/KT-79928) Allow JsModule/JsNonModule/JsQualifier invocation on per-entity level
- [KT-80401](https://youtrack.jetbrains.com/issue/KT-80401) Kotlin/JS support for `default export` in generated JavaScript
- [KT-81066](https://youtrack.jetbrains.com/issue/KT-81066) Wasm, JS: Remove redundant logging in compiler output
- [KT-81424](https://youtrack.jetbrains.com/issue/KT-81424) Kotlin/JS: Cannot Get / in a simple running application 

### Backend. JVM
- [KT-79231](https://youtrack.jetbrains.com/issue/KT-79231) Inconsistent InnerClass entry flags for abstract inner enum
- [KT-81618](https://youtrack.jetbrains.com/issue/KT-81618) "Number of arguments should not be less than number of parameters" on JVM on Kotlin 2.3.0-Beta1

### Backend. JVM. Inline
- [KT-76479](https://youtrack.jetbrains.com/issue/KT-76479) Backend. JVM: Report errors on exposure of types in inline functions

### Backend. Native
- [KT-80929](https://youtrack.jetbrains.com/issue/KT-80929) IC Native: Undefined symbols on ktor
- [KT-81057](https://youtrack.jetbrains.com/issue/KT-81057) Wrong handling of boxing during redundant casts optimization
- [KT-81064](https://youtrack.jetbrains.com/issue/KT-81064) Wrong safe call null check handling during redundant casts optimization
- [KT-81241](https://youtrack.jetbrains.com/issue/KT-81241) Konanc exit while lowering org.jetbrains.kotlin.ir.util.IrUtilsKt.remapTypeParameters
- [KT-81257](https://youtrack.jetbrains.com/issue/KT-81257) Native: "Unexpected boolean predicate" when generating 'static_cache'
- [KT-81340](https://youtrack.jetbrains.com/issue/KT-81340) K/N: severe compilation time degradation after turning on casts optimization pass
- [KT-81617](https://youtrack.jetbrains.com/issue/KT-81617) Native: casts optimizations pass explodes on deep nested loops
- [KT-81652](https://youtrack.jetbrains.com/issue/KT-81652) Native: ClassCastException: ApplicationForegroundStateListener.Companion

### Backend. Wasm
- [KT-76204](https://youtrack.jetbrains.com/issue/KT-76204) K/Wasm: support generating a wasm module per kotlin module/klib
- [KT-79244](https://youtrack.jetbrains.com/issue/KT-79244) [Wasm] Drop K1-specific tests, testrunners and test directives
- [KT-80106](https://youtrack.jetbrains.com/issue/KT-80106) devServer in Kotlin/Wasm overwrites defaults, causing missing static paths
- [KT-80397](https://youtrack.jetbrains.com/issue/KT-80397) K/Wasm: turn on by default using a new version of the exception handling proposal for wasm-wasi target
- [KT-81372](https://youtrack.jetbrains.com/issue/KT-81372) K/Wasm: JsException: Exception was thrown while running JavaScript code on Safari 18.2/18.3

### Binary Metadata
- [KT-81198](https://youtrack.jetbrains.com/issue/KT-81198) Move type and type parameter annotations from jvm_metadata.proto to metadata.proto

### Build Infrastructure
- [KT-80028](https://youtrack.jetbrains.com/issue/KT-80028) K/Wasm: download JavaScriptCore for wasm tests

### Frontend
- [KT-76344](https://youtrack.jetbrains.com/issue/KT-76344) Drop language version 1.9 for non-JVM platforms
- [KT-78390](https://youtrack.jetbrains.com/issue/KT-78390) Unmute `FusStatisticsIT.testKotlinxPlugins()` after AtomicFU updates `kotlin-metadata-jvm`
- [KT-81186](https://youtrack.jetbrains.com/issue/KT-81186) Only allow local type aliases in REPL/scripts until full stabilization

### Frontend. Checkers
- [KT-20677](https://youtrack.jetbrains.com/issue/KT-20677) Improve diagnostic about implicit default constructor absence for expected annotation class
- [KT-70507](https://youtrack.jetbrains.com/issue/KT-70507) Should parentheses prevent from plus/set operator desugaring?
- [KT-76902](https://youtrack.jetbrains.com/issue/KT-76902) Omit type-use annotations from diagnostics
- [KT-77727](https://youtrack.jetbrains.com/issue/KT-77727) Move some of the extra checkers to the default list
- [KT-79369](https://youtrack.jetbrains.com/issue/KT-79369) Forbid typealiasing for all compiler-required annotations
- [KT-80031](https://youtrack.jetbrains.com/issue/KT-80031) Check spotbugs's @CheckReturnValue in Kotlin's unused return value checker
- [KT-80837](https://youtrack.jetbrains.com/issue/KT-80837) Warn about extension function with a context shadowed by member
- [KT-81141](https://youtrack.jetbrains.com/issue/KT-81141) Fix FirUnsupportedArrayLiteralChecker to forbid array literals inside non-annotation contexts
- [KT-81222](https://youtrack.jetbrains.com/issue/KT-81222) Custom getter is allowed on a property with redundant EBF
- [KT-81245](https://youtrack.jetbrains.com/issue/KT-81245) Automatic smart cast on properties with EBF is allowed on inlined property accessors
- [KT-81251](https://youtrack.jetbrains.com/issue/KT-81251) Smartcast doesn't work for an effectively private inline function
- [KT-81385](https://youtrack.jetbrains.com/issue/KT-81385) Missing error of nullable expression in class literal in case of reified type parameter
- [KT-81522](https://youtrack.jetbrains.com/issue/KT-81522) Fix Light Tree `SPREAD_OPERATOR` diagnostic positioning
- [KT-81525](https://youtrack.jetbrains.com/issue/KT-81525) Report REDUNDANT_SPREAD_OPERATOR on (*) instead of argument expression
- [KT-81657](https://youtrack.jetbrains.com/issue/KT-81657) K2: put warning about "exposing package-private in internal" under experimental language feature

### Frontend. Data-flow analysis
- [KT-79506](https://youtrack.jetbrains.com/issue/KT-79506) Contract for getter and setter doesn't work if a property is called from another module

### Frontend. FIR tree
- [KT-69294](https://youtrack.jetbrains.com/issue/KT-69294) K2: Report `CONSTRUCTOR_OR_SUPERTYPE_ON_TYPEALIAS_WITH_TYPE_PROJECTION_ERROR` instead of `EXPANDED_TYPE_CANNOT_BE_INHERITED` after switching to LV 2.2

### Frontend. FIR2IR
- [KT-65882](https://youtrack.jetbrains.com/issue/KT-65882) K2: "KotlinNothingValueException" caused by unsafe cast and Nothing::class
- [KT-80871](https://youtrack.jetbrains.com/issue/KT-80871) StackOverflowError on AnnotationTarget.TYPE
- [KT-80908](https://youtrack.jetbrains.com/issue/KT-80908) K2: Compiling type annotation with self-annotated vararg fail with exception

### Frontend. Resolution and Inference
- [KT-71420](https://youtrack.jetbrains.com/issue/KT-71420) Report error when reified type parameter is inferred to intersection type
- [KT-74588](https://youtrack.jetbrains.com/issue/KT-74588) Redundant checkNotNull intrinsics instructions for Java generic methods
- [KT-74819](https://youtrack.jetbrains.com/issue/KT-74819) K2: False-positive overload resolution ambiguity for flatMap inside PCLA
- [KT-74999](https://youtrack.jetbrains.com/issue/KT-74999) K2: KotlinNothingValueException within Extension Function
- [KT-77008](https://youtrack.jetbrains.com/issue/KT-77008) K2: Incorrectly force casting to a wrong type
- [KT-78127](https://youtrack.jetbrains.com/issue/KT-78127) K2: Too precise inference for if/when with expected type in assignment
- [KT-80208](https://youtrack.jetbrains.com/issue/KT-80208) K2: ClassCastException: "class java.util.ArrayList cannot be cast to class java.lang.Void"  type inference picks Void for generic function
- [KT-80250](https://youtrack.jetbrains.com/issue/KT-80250) ISE:  flow for PostponedLambdaExitNode not initialized - traversing nodes in wrong order?
- [KT-80577](https://youtrack.jetbrains.com/issue/KT-80577) "Return type mismatch" for self-referential types used as generic parameters
- [KT-81115](https://youtrack.jetbrains.com/issue/KT-81115) Allow converting lambda with explicit parameter when assigning to variable of an extension function type
- [KT-81191](https://youtrack.jetbrains.com/issue/KT-81191) K2: "null cannot be cast to non-null type ConeTypeParameterLookupTag" with invalid code
- [KT-81254](https://youtrack.jetbrains.com/issue/KT-81254) "AssertionError: There should be at least one non-stub type to compute common supertype": Parser issue during generic type inference
- [KT-81383](https://youtrack.jetbrains.com/issue/KT-81383) Return type of anonymous function used as `run` argument is incorrectly inferred to `Nothing` 
- [KT-9111](https://youtrack.jetbrains.com/issue/KT-9111) Improve diagnostic for call with access to outer class from nested class

### IDE. Gradle Integration
- [KT-44845](https://youtrack.jetbrains.com/issue/KT-44845) After update to Kotlin 1.4.30 all external dependencies is unresolved in IDE with kotlin.mpp.enableGranularSourceSetsMetadata=true
- [KT-46142](https://youtrack.jetbrains.com/issue/KT-46142) K/N distribution is unavailable from IDE with multiplatform hierarchical project structure enabled
- [KT-46273](https://youtrack.jetbrains.com/issue/KT-46273) MPP: Don't fail import for case of missed platform in source set structure
- [KT-46417](https://youtrack.jetbrains.com/issue/KT-46417) [UNRESOLVED_REFERENCE] For project to project dependencies of native platform test source sets

### IR. Inlining
- [KT-69516](https://youtrack.jetbrains.com/issue/KT-69516) Double-inlining for Native: Enable visibility checks after 1st phase of inlining
- [KT-74892](https://youtrack.jetbrains.com/issue/KT-74892) Investigate passing inline lambda as argument of another inline function
- [KT-78392](https://youtrack.jetbrains.com/issue/KT-78392) CommonPrefix: Add a way of stopping execution when one of the phases is unsuccessful 
- [KT-78673](https://youtrack.jetbrains.com/issue/KT-78673) Make fakeOverrideLocalGenericBase not using red code
- [KT-79718](https://youtrack.jetbrains.com/issue/KT-79718) KLIB inliner: Emit warning on generation of `public` synthetic accessor when running in "explicit API mode"
- [KT-80565](https://youtrack.jetbrains.com/issue/KT-80565) KLIB Inliner: Add a special annotation to prohibit inlining of marked inline functions in stdlib on 1st compilation phase
- [KT-80628](https://youtrack.jetbrains.com/issue/KT-80628) KLIB inliner: Not enough information about the "full" mode
- [KT-80927](https://youtrack.jetbrains.com/issue/KT-80927) [Native] Review intrinsics with PublishedApi
- [KT-81070](https://youtrack.jetbrains.com/issue/KT-81070) [Inliner] kotlin/Any is unbound
- [KT-81673](https://youtrack.jetbrains.com/issue/KT-81673) False warnings about ABI change in dependencies in library mode in 2.3.0-Beta1
- [KT-81713](https://youtrack.jetbrains.com/issue/KT-81713) [Inliner] Compilation of inline function with recursive call applied to TODO() fails with an internal error

### IR. Interpreter
- [KT-72356](https://youtrack.jetbrains.com/issue/KT-72356) K2 Native: IllegalStateException when annotation has the same source range as a constant in another file

### IR. Tree
- [KT-78100](https://youtrack.jetbrains.com/issue/KT-78100) Track and annotate internal annotations with @PublishedApi to enable annotation visibility validation
- [KT-78856](https://youtrack.jetbrains.com/issue/KT-78856) Refactor LocalDeclarationsLowering to split it in smaller parts
- [KT-79739](https://youtrack.jetbrains.com/issue/KT-79739) Static synthetic accessors inside generic classes access its type parameters
- [KT-79807](https://youtrack.jetbrains.com/issue/KT-79807) Broken IR tree invariants in IrReplSnippet after FIR2IR
- [KT-80825](https://youtrack.jetbrains.com/issue/KT-80825) Drop `IrSerializationSettings.reuseExistingSignaturesForSymbols` setting

### Klibs
- [KT-64237](https://youtrack.jetbrains.com/issue/KT-64237) Klib metadata: migrate to using the common annotations instead of klib-specific extensions in the compiler
- [KT-80290](https://youtrack.jetbrains.com/issue/KT-80290) Remove `if` and TODO in `countInAsInlinedLambdaArgumentWithPermittedNonLocalReturns`
- [KT-80298](https://youtrack.jetbrains.com/issue/KT-80298) K/N: one-stage compilation is broken
- [KT-80761](https://youtrack.jetbrains.com/issue/KT-80761) K2: [K/N] Should reported klib usage include inheritance
- [KT-80999](https://youtrack.jetbrains.com/issue/KT-80999) Reuse existing `IrKotlinLibraryLayout` in `KotlinLibrary` for  reading pre-processed functions

### Language Design
- [KT-28850](https://youtrack.jetbrains.com/issue/KT-28850) Prohibit protected visibility in final expected classes
- [KT-81561](https://youtrack.jetbrains.com/issue/KT-81561) Update nested type aliases KEEP to reflect local type aliases support

### Libraries
- [KT-72111](https://youtrack.jetbrains.com/issue/KT-72111) Change Duration.parseOrNull logic to not throw exceptions internally
- [KT-74493](https://youtrack.jetbrains.com/issue/KT-74493) Deprecate String.subSequence(start, end) with error and drop it in the future
- [KT-79791](https://youtrack.jetbrains.com/issue/KT-79791) Duration.parse incorrectly handles negative decimal seconds in ISO-8601 format
- [KT-80431](https://youtrack.jetbrains.com/issue/KT-80431) Remove suppression of "ACTUAL_ANNOTATIONS_NOT_MATCH_EXPECT" from stdlib
- [KT-80530](https://youtrack.jetbrains.com/issue/KT-80530) Annotate Kotlin/Native stdlib with must-use value/@IgnorableReturnValue when appropriate
- [KT-81043](https://youtrack.jetbrains.com/issue/KT-81043) String.toBigDecimalOrNull rejects strings accepted by String.toBigDecimal
- [KT-81078](https://youtrack.jetbrains.com/issue/KT-81078) Increase kotlin.io.createTempDir and createTempFile deprecation level to ERROR
- [KT-81092](https://youtrack.jetbrains.com/issue/KT-81092) Uuid: support generation of version 7 uuids with a given timestamp
- [KT-81477](https://youtrack.jetbrains.com/issue/KT-81477) Uuid.Companion.generateV* are missing SinceKotlin annotation
- [KT-81478](https://youtrack.jetbrains.com/issue/KT-81478) FileTreeWalkTest.withDirectoryFilter fails on Windows

### Native. C and ObjC Import
- [KT-81312](https://youtrack.jetbrains.com/issue/KT-81312) Native: when `-Xccall-mode direct` is used, mark unsupported declarations with unresolvable symbol name instead of @Deprecated(ERROR)

### Native. Swift Export
- [KT-80969](https://youtrack.jetbrains.com/issue/KT-80969) Swift Export: Call `suspend` function as `async` on swift side
- [KT-81355](https://youtrack.jetbrains.com/issue/KT-81355) Swift Export: Introduce a flag to turn off coroutines export

### Test Infrastructure
- [KT-80995](https://youtrack.jetbrains.com/issue/KT-80995) Exclude generated Klib/IR testrunners from git tracking
- [KT-81046](https://youtrack.jetbrains.com/issue/KT-81046) MT tests: get rid of platform dependency in model XML handling code

### Tools. Build Tools API
- [KT-81130](https://youtrack.jetbrains.com/issue/KT-81130) BTA: using KotlinVersion from stdlib in the API breaks when using isolated classloader
- [KT-81321](https://youtrack.jetbrains.com/issue/KT-81321) Deprecate old BTA prototype API
- [KT-81602](https://youtrack.jetbrains.com/issue/KT-81602) BTA: rename KotlinToolchains.jvm @JvmName for a more Java-friendly API

### Tools. CLI
- [KT-77428](https://youtrack.jetbrains.com/issue/KT-77428) Merge -XXdump-model CLI argument into master
- [KT-81077](https://youtrack.jetbrains.com/issue/KT-81077) Add JVM target bytecode version 25

### Tools. Commonizer
- [KT-46248](https://youtrack.jetbrains.com/issue/KT-46248) MPP: Compile KotlinMetadata fails with Unresolved reference if only one native platform from shared source set is available
- [KT-47523](https://youtrack.jetbrains.com/issue/KT-47523) MPP: Unable to resolve c-interop dependency if platform is included in an intermediate source set with the only target
- [KT-48118](https://youtrack.jetbrains.com/issue/KT-48118) Commonized c-interop lib is not attached to common main source set
- [KT-49735](https://youtrack.jetbrains.com/issue/KT-49735) [Commonizer] :commonizeNativeDistribution  fails for projects with two or more same native targets

### Tools. Compiler Plugins
- [KT-64339](https://youtrack.jetbrains.com/issue/KT-64339) Symbol Light Classes: No Arg compiler plugin generates synthethic constructor which is not seen from light classes
- [KT-80429](https://youtrack.jetbrains.com/issue/KT-80429) Power Assert with "Run test using: IntelliJ": NoClassDefFoundError (org.jetbrains.kotlin.kotlinx.collections.immutable.ExtensionsKt) during compilation
- [KT-80944](https://youtrack.jetbrains.com/issue/KT-80944) FirUserTypeRefImpl cannot be cast to class FirResolvedTypeRef in maven project
- [KT-81091](https://youtrack.jetbrains.com/issue/KT-81091) [DataFrame] Receivers from FirExpressionResolutionExtension are not resolved in CodeFragment
- [KT-81348](https://youtrack.jetbrains.com/issue/KT-81348) Incorrect bytecode mentioning error class/package is generated by kotlinx-serialization when private serializer in another module is not accessible

### Tools. Gradle
- [KT-45161](https://youtrack.jetbrains.com/issue/KT-45161) Gradle: Support registering generated sources with the Kotlin model
- [KT-67290](https://youtrack.jetbrains.com/issue/KT-67290) Deprecate usage of HasKotlinDependencies inside KotlinCompilation
- [KT-70251](https://youtrack.jetbrains.com/issue/KT-70251) Gradle: hide compiler symbols in KGP
- [KT-71602](https://youtrack.jetbrains.com/issue/KT-71602) Introduce KotlinTopLevelExtension
- [KT-75869](https://youtrack.jetbrains.com/issue/KT-75869) KGP JS - Update deprecated constructors
- [KT-77457](https://youtrack.jetbrains.com/issue/KT-77457) Compile against Gradle API 9.0
- [KT-79047](https://youtrack.jetbrains.com/issue/KT-79047) Gradle compileKotlin fails with configuration cache
- [KT-80763](https://youtrack.jetbrains.com/issue/KT-80763) Add redirect link to error message when 'org.jetbrains.kotlin.android' plugin is used with built-in Kotlin
- [KT-80950](https://youtrack.jetbrains.com/issue/KT-80950) KGP breaks configuration cache when signing plugin with GnuPG is applied
- [KT-81199](https://youtrack.jetbrains.com/issue/KT-81199) Deprecate "org.jetbrains.kotlin.android" plugin
- [KT-81415](https://youtrack.jetbrains.com/issue/KT-81415) BTA: Duplicate daemons when compiling JVM + JS in KGP
- [KT-81837](https://youtrack.jetbrains.com/issue/KT-81837) Run integration tests against AGP 8.13

### Tools. Gradle. BCV
- [KT-80687](https://youtrack.jetbrains.com/issue/KT-80687) Add description to Gradle tasks [ABI Validation]

### Tools. Gradle. Compiler plugins
- [KT-81827](https://youtrack.jetbrains.com/issue/KT-81827) Add a switch for mapping file tasks in Compose Gradle plugin

### Tools. Gradle. JS
- [KT-75621](https://youtrack.jetbrains.com/issue/KT-75621) KJS / Gradle: Disable npm in --offline mode
- [KT-76019](https://youtrack.jetbrains.com/issue/KT-76019) Wasm/JS: Promote phantom-js for Karma deprecation to ERROR
- [KT-81004](https://youtrack.jetbrains.com/issue/KT-81004) K/JS, Wasm: promote deprecation NodeJsExec.create to Error
- [KT-81005](https://youtrack.jetbrains.com/issue/KT-81005) K/JS, Wasm: Promote deprecation of ExperimentalWasmDsl to Error
- [KT-81006](https://youtrack.jetbrains.com/issue/KT-81006) K/JS, Wasm: Promote wasm declarations in "js" package deprecation to Error
- [KT-81007](https://youtrack.jetbrains.com/issue/KT-81007) K/JS, Wasm: Promote deprecation of public constructors of JS declarations to Error
- [KT-81008](https://youtrack.jetbrains.com/issue/KT-81008) K/JS, Wasm: Promote deprecation of ExperimentalDceDsl to Error
- [KT-81009](https://youtrack.jetbrains.com/issue/KT-81009) K/JS, Wasm: Promote deprecation of NPM and Yarn package manager internal functions
- [KT-81010](https://youtrack.jetbrains.com/issue/KT-81010) K/JS, Wasm: Promote deprecation of internal JS functions to Error

### Tools. Gradle. Multiplatform
- [KT-52216](https://youtrack.jetbrains.com/issue/KT-52216) HMPP / KTOR: False positive "TYPE_MISMATCH" with Throwable descendant
- [KT-55230](https://youtrack.jetbrains.com/issue/KT-55230) Remove metadata dependencies transformation for runtimeOnly scope
- [KT-55312](https://youtrack.jetbrains.com/issue/KT-55312) Replace "ALL_COMPILE_DEPENDENCIES_METADATA" configuration with set of metadata dependencies configurations associated per set
- [KT-61127](https://youtrack.jetbrains.com/issue/KT-61127) Remove scoped resolvable and intransitive DependenciesMetadata configurations used in the pre-IdeMultiplatformImport IDE import
- [KT-74955](https://youtrack.jetbrains.com/issue/KT-74955) Remove resources resolution strategy completely
- [KT-77066](https://youtrack.jetbrains.com/issue/KT-77066) Promote kotlinArtifacts deprecation to an error
- [KT-77367](https://youtrack.jetbrains.com/issue/KT-77367) [uklib] Project dependency to kotlin-jvm module leads to failure in transform during IDE import
- [KT-81200](https://youtrack.jetbrains.com/issue/KT-81200) Deprecate 'androidTarget'
- [KT-81249](https://youtrack.jetbrains.com/issue/KT-81249) Kotlin 2.2.20 broke KMP implementation of Parcelize
- [KT-81434](https://youtrack.jetbrains.com/issue/KT-81434) [uklib] androidCompileClasspath resolves java compatibility variant instead of android for uklib library
- [KT-81469](https://youtrack.jetbrains.com/issue/KT-81469) [uklib] kmpPublicationStrategy affects resolution during import  for androidTarget

### Tools. Gradle. Native
- [KT-77486](https://youtrack.jetbrains.com/issue/KT-77486) Remove bitcode DSL
- [KT-77732](https://youtrack.jetbrains.com/issue/KT-77732) `commonizeCInterop` failed with "Unresolved classifier: platform/posix/size_t"
- [KT-80675](https://youtrack.jetbrains.com/issue/KT-80675) Commonized cinterops between "test" compilations produce an import failure
- [KT-81134](https://youtrack.jetbrains.com/issue/KT-81134) Native: Gradle configuration failure likely related to Klibs cross-compilation

### Tools. Gradle. Swift Export
- [KT-81460](https://youtrack.jetbrains.com/issue/KT-81460) [KGP] Crash in SwiftExportRunner due to older stdlib
- [KT-81465](https://youtrack.jetbrains.com/issue/KT-81465) Swift Export package is build with wrong target

### Tools. Kapt
- [KT-71786](https://youtrack.jetbrains.com/issue/KT-71786) K2Kapt: Stubs generation does not fail on files with declaration errors
- [KT-80843](https://youtrack.jetbrains.com/issue/KT-80843) K2: KAPT: Crash on any data class with duplicate properties: "Sequence contains more than one matching element"

### Tools. Maven
- [KT-78201](https://youtrack.jetbrains.com/issue/KT-78201) Maven: migrate JVM compilation to the new BTA
- [KT-81218](https://youtrack.jetbrains.com/issue/KT-81218) Kotlin Maven Plugin 2.2.20: Java classes not resolved with enabled incremental compilation without daemon
- [KT-81414](https://youtrack.jetbrains.com/issue/KT-81414) 2.2.20 regression: OOM (Compressed class space) when in-process
- [KT-81435](https://youtrack.jetbrains.com/issue/KT-81435) Maven: Improve BTA classloader reusage
- [KT-81681](https://youtrack.jetbrains.com/issue/KT-81681) Maven: "NoClassDefFoundError" on a second test run

### Tools. REPL
- [KT-80062](https://youtrack.jetbrains.com/issue/KT-80062) ReplSnippetLowering sometimes produces IrConstructorCall with too many arguments

### Tools. Scripts
- [KT-80071](https://youtrack.jetbrains.com/issue/KT-80071) Kotlin script mode produces invalid IR: "value that is not available in the current scope" 

### Tools. Wasm
- [KT-81313](https://youtrack.jetbrains.com/issue/KT-81313) K/Wasm: update Node.js to 24.x
- [KT-81315](https://youtrack.jetbrains.com/issue/KT-81315) K/Wasm: update Node.js to 25.x

