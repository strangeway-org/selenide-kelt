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

import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Condition.*
import org.junit.jupiter.api.Test

class ConditionsTest {
    @Test
    fun `elt with infix conditions`() {
        elt(".some") should exist
        elt(".some") shouldBe visible
        elt(css = ".some") shouldHave text("text")

        elt(".some") shouldNot exist
        elt(xpath = "//div") shouldNotBe hidden
        elt(id = "main") shouldNotHave exactText("text")
    }

    @Test
    fun `elts with infix conditions`() {
        elts(".some") shouldBe CollectionCondition.empty
        elts(".some") shouldHave CollectionCondition.texts("")
    }
}