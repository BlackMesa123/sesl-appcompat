/*
 * Copyright 2022 The Android Open Source Project
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

package androidx.reflect.view.accessibility;

import android.view.accessibility.AccessibilityManager;

import androidx.reflect.SeslBaseReflector;

import java.lang.reflect.Method;

/*
 * Original code by Samsung, all rights reserved to the original author.
 */

/**
 * Samsung AccessibilityManager utility class.
 */
public class SeslAccessibilityManagerReflector {
    private static String mClassName = "android.view.accessibility.AccessibilityManager";

    /**
     * Returns semScreenReader status in the given <arg>accessibilityManager</arg>.
     */
    public static boolean isScreenReaderEnabled(AccessibilityManager accessibilityManager, boolean defaultValue) {
        Method method = SeslBaseReflector.getDeclaredMethod(mClassName, "semIsScreenReaderEnabled");
        if (accessibilityManager != null && method != null) {
            return (Boolean) SeslBaseReflector.invoke(accessibilityManager, method);
        } else {
            return defaultValue;
        }
    }
}
