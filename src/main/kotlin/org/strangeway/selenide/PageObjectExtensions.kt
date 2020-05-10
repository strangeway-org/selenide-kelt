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