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

import com.codeborne.selenide.Selenide
import com.codeborne.selenide.SelenideDriver
import java.net.URL

inline fun <reified PageObjectClass> page(): PageObjectClass =
    Selenide.page(PageObjectClass::class.java)

inline fun <reified PageObjectClass> openPage(relativeOrAbsoluteUrl: String): PageObjectClass =
    Selenide.open(relativeOrAbsoluteUrl, PageObjectClass::class.java)

inline fun <reified PageObjectClass> openPage(absoluteUrl: URL): PageObjectClass =
    Selenide.open(absoluteUrl, PageObjectClass::class.java)

inline fun <reified PageObjectClass> openPage(
    relativeOrAbsoluteUrl: String,
    domain: String,
    login: String,
    password: String
): PageObjectClass = Selenide.open(relativeOrAbsoluteUrl, domain, login, password, PageObjectClass::class.java)

inline fun <reified PageObjectClass> openPage(
    absoluteUrl: URL,
    domain: String,
    login: String,
    password: String
): PageObjectClass = Selenide.open(absoluteUrl, domain, login, password, PageObjectClass::class.java)

inline fun <reified PageObjectClass> SelenideDriver.page(): PageObjectClass =
    this.page(PageObjectClass::class.java)

inline fun <reified PageObjectClass> SelenideDriver.openPage(relativeOrAbsoluteUrl: String): PageObjectClass =
    this.open(relativeOrAbsoluteUrl, PageObjectClass::class.java)

inline fun <reified PageObjectClass> SelenideDriver.openPage(absoluteUrl: URL): PageObjectClass =
    this.open(absoluteUrl, PageObjectClass::class.java)

inline fun <reified PageObjectClass> SelenideDriver.openPage(
    relativeOrAbsoluteUrl: String,
    domain: String,
    login: String,
    password: String
): PageObjectClass = this.open(relativeOrAbsoluteUrl, domain, login, password, PageObjectClass::class.java)

inline fun <reified PageObjectClass> SelenideDriver.openPage(
    absoluteUrl: URL,
    domain: String,
    login: String,
    password: String
): PageObjectClass = this.open(absoluteUrl, domain, login, password, PageObjectClass::class.java)