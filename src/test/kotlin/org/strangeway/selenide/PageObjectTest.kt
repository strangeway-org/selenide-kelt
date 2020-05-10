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