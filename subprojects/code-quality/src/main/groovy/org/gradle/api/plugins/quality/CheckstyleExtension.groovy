/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins.quality

import org.gradle.api.Project

class CheckstyleExtension extends CodeQualityExtension {
    CheckstyleExtension(Project project) {
        super(project)
    }

    /**
     * The Checkstyle configuration file to use.
     */
    File configFile
    
    /**
     * The directory into which Checkstyle reports will be saved. Defaults to <tt>$reporting.baseDir/findbugs</tt>.
     */
    File reportsDir

    /**
     * The properties available for use in the configuration file. These are substituted into the configuration
     * file. Defaults to the empty map.
     */
    Map<String, Object> configProperties

    /**
     * Specifies whether the build should display violations on the console or not. Defaults to true
     */
    /**
     * Whether or not the build should display violations on the console or not. Defaults to <tt>true</tt>.
     *
     * Example: displayViolations = false
     */
    boolean displayViolations = true
}
