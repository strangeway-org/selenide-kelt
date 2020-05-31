<table><tr>
  <td>
    <img src="https://github.com/strangeway-org/selenide-kelt/blob/master/img/kelt.png" alt="Kelt Helmet" width="64px">
  </td>
  <td>
    <h1>Selenide Kelt</h1>
  </td>
</tr></table>

Extension functions to make Selenide tests with Kotlin awesome!

[ ![Download](https://api.bintray.com/packages/strangeway-org/libs/selenide-kelt/images/download.svg?version=1.0.1) ](https://bintray.com/strangeway-org/libs/selenide-kelt/1.0.1/link)

## How to add dependency

Gradle:
```groovy
repositories {
    maven {
        url "https://dl.bintray.com/strangeway-org/libs" 
    }
}

dependencies {
    test "org.strangeway:selenide-kelt:1.0.1"
}
```

## Examples:

1. Get element by any of standard By:
    ```kotlin
    open("/login")
    
    elt(css = "#submit").click()
    elt(cssClass = "message").shouldHave(text("Hello"))
    
    elt(text = "Sign in").click()
    elt(name = "password").setValue("qwerty").pressEnter()
    
    elt(xpath = "//*[@id='search-results']//a[contains(text(),'selenide.org')]").click()
    ```

2. Or many elements:
    ```kotlin
    elts(id = "search-results").shouldBe(visible)
    elts("#search-results a").elt(text = "selenide.org").click()
    ```

3. Element inside of elements:
   ```kotlin
   elt(tag = "header").elt(id = "menu").click()
   ```

2. Build PageObject classes simpler:
    ```kotlin
    class GoogleResultsPage {
        val results = elt(id = "results")
    }
    
    class GoogleSearchPage {
        private val searchBox = elt(name = "q")
    
        fun search(query: String): GoogleResultsPage {
            searchBox.setValue(query).pressEnter()
            return page()
        }
    }
   
    // ...
    openPage<GoogleSearchPage>("http://google.com").search("Selenide!")
    ```