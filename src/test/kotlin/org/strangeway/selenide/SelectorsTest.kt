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

class SelectorsTest {
    @Test
    fun `elt creates SelenideElement`() {
        elt(".some")
        elt(css = ".some")
        elt(xpath = "//div")
        elt(id = "main")
        elt(name = "main")
        elt(tag = "div")
        elt(cssClass = "main")
        elt(linkText = "main")
        elt(partialLinkText = "main")
        elt(text = "main")
        elt(textContains = "main")
        elt(title = "Main")
        elt(value = "Main")
    }

    @Test
    fun `SelenideDriver elt creates SelenideElement`() {
        val driver = SelenideDriver(SelenideConfig())
        driver.elt(".some")
        driver.elt(css = ".some")
        driver.elt(xpath = "//div")
        driver.elt(id = "main")
        driver.elt(name = "main")
        driver.elt(tag = "div")
        driver.elt(cssClass = "main")
        driver.elt(linkText = "main")
        driver.elt(partialLinkText = "main")
        driver.elt(text = "main")
        driver.elt(textContains = "main")
        driver.elt(title = "Main")
        driver.elt(value = "Main")
    }

    @Test
    fun `nested elt creates SelenideElement`() {
        val body = elt("body")

        body.elt(".some")
        body.elt(css = ".some")
        body.elt(xpath = "//div")
        body.elt(id = "main")
        body.elt(name = "main")
        body.elt(tag = "div")
        body.elt(cssClass = "main")
        body.elt(linkText = "main")
        body.elt(partialLinkText = "main")
        body.elt(text = "main")
        body.elt(textContains = "main")
        body.elt(title = "Main")
        body.elt(value = "Main")
    }

    @Test
    fun `elts creates ElementsCollection`() {
        elts(".some")
        elts(css = ".some")
        elts(xpath = "//div")
        elts(id = "main")
        elts(name = "main")
        elts(tag = "div")
        elts(cssClass = "main")
        elts(linkText = "main")
        elts(partialLinkText = "main")
        elts(text = "main")
        elts(textContains = "main")
        elts(title = "Main")
        elts(value = "Main")
    }

    @Test
    fun `SelenideDriver elts creates SelenideElement`() {
        val driver = SelenideDriver(SelenideConfig())
        driver.elts(".some")
        driver.elts(css = ".some")
        driver.elts(xpath = "//div")
        driver.elts(id = "main")
        driver.elts(name = "main")
        driver.elts(tag = "div")
        driver.elts(cssClass = "main")
        driver.elts(linkText = "main")
        driver.elts(partialLinkText = "main")
        driver.elts(text = "main")
        driver.elts(textContains = "main")
        driver.elts(title = "Main")
        driver.elts(value = "Main")
    }

    @Test
    fun `nested elts creates ElementsCollection`() {
        val body = elt("body")

        body.elts(".some")
        body.elts(css = ".some")
        body.elts(xpath = "//div")
        body.elts(id = "main")
        body.elts(name = "main")
        body.elts(tag = "div")
        body.elts(cssClass = "main")
        body.elts(linkText = "main")
        body.elts(partialLinkText = "main")
        body.elts(text = "main")
        body.elts(textContains = "main")
        body.elts(title = "Main")
        body.elts(value = "Main")
    }
}