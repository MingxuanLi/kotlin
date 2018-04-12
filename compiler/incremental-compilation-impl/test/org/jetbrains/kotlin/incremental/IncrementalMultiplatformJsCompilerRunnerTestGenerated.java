/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps-plugin/testData/incremental/multiplatform")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalMultiplatformJsCompilerRunnerTestGenerated extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
    public void testAllFilesPresentInMultiplatform() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
    }

    @TestMetadata("touchActual")
    public void testTouchActual() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/touchActual/");
        doTest(fileName);
    }

    @TestMetadata("touchExpect")
    public void testTouchExpect() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/touchExpect/");
        doTest(fileName);
    }

    @TestMetadata("jps-plugin/testData/incremental/multiplatform/multiModule")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MultiModule extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
        public void testAllFilesPresentInMultiModule() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform/multiModule"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/dependent")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Dependent extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
            public void testAllFilesPresentInDependent() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform/multiModule/dependent"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }

            @TestMetadata("initial")
            public void testInitial() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/dependent/initial/");
                doTest(fileName);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/multiplatformDependsOnRegular")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class MultiplatformDependsOnRegular extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
            public void testAllFilesPresentInMultiplatformDependsOnRegular() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform/multiModule/multiplatformDependsOnRegular"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }

            @TestMetadata("initial")
            public void testInitial() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/multiplatformDependsOnRegular/initial/");
                doTest(fileName);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/onePlatformTwoCommon")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class OnePlatformTwoCommon extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
            public void testAllFilesPresentInOnePlatformTwoCommon() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform/multiModule/onePlatformTwoCommon"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }

            @TestMetadata("initial")
            public void testInitial() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/onePlatformTwoCommon/initial/");
                doTest(fileName);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/regularDependensOnMultiplatform")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class RegularDependensOnMultiplatform extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
            public void testAllFilesPresentInRegularDependensOnMultiplatform() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform/multiModule/regularDependensOnMultiplatform"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }

            @TestMetadata("initial")
            public void testInitial() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/regularDependensOnMultiplatform/initial/");
                doTest(fileName);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/simple")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Simple extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
            public void testAllFilesPresentInSimple() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform/multiModule/simple"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }

            @TestMetadata("initial")
            public void testInitial() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/simple/initial/");
                doTest(fileName);
            }
        }

        @TestMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/simpleJsJvmProjectWithTests")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class SimpleJsJvmProjectWithTests extends AbstractIncrementalMultiplatformJsCompilerRunnerTest {
            public void testAllFilesPresentInSimpleJsJvmProjectWithTests() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiplatform/multiModule/simpleJsJvmProjectWithTests"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }

            @TestMetadata("initial")
            public void testInitial() throws Exception {
                String fileName = KotlinTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiplatform/multiModule/simpleJsJvmProjectWithTests/initial/");
                doTest(fileName);
            }
        }
    }
}
