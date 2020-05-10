/*
 * Copyright (c) 2016 Yuriy Artamonov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.strangeway.selenide

import com.codeborne.selenide.SelenideConfig
import com.codeborne.selenide.SelenideDriver
import org.junit.jupiter.api.Test
import java.net.URL

private const val SITE_URL = "http://strangeway.org"

class PageObjectTest {
    @Test
    fun `open creates typed PageObject`() {
        @Suppress("UNUSED_VARIABLE")
        val examples: () -> Unit = {
            page<TestPage>()
            openPage<TestPage>(SITE_URL)
            openPage<TestPage>(URL(SITE_URL))
            openPage<TestPage>("/", SITE_URL, "user", "password")
            openPage<TestPage>(URL(SITE_URL), SITE_URL, "user", "password")

            val driver = SelenideDriver(SelenideConfig())
            driver.page<TestPage>()
            driver.openPage<TestPage>(SITE_URL)
            driver.openPage<TestPage>(URL(SITE_URL))
            driver.openPage<TestPage>("/", SITE_URL, "user", "password")
            driver.openPage<TestPage>(URL(SITE_URL), SITE_URL, "user", "password")
        }
    }
}