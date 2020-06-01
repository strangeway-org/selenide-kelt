/*
 * Copyright (c) 2020 Yuriy Artamonov.
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
package org.strangeway.kelt

import com.codeborne.selenide.Condition.visible
import org.junit.jupiter.api.Test

class GoogleResultsPage {
    val results = elt(id = "results")
}

class GoogleSearchPage {
    private val searchBox = elt(name = "q")

    fun search(query: String?): GoogleResultsPage {
        searchBox.setValue(query).pressEnter()
        return page()
    }
}

class GoogleSeachPageTest {
    @Test
    fun test() {
        openPage<GoogleSearchPage>("http://google.com")
            .search("Selenide!")
            .results.shouldBe(visible)
    }
}