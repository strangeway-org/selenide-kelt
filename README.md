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

## Maven dependency:

Gradle:
```groovy
repositories {
    maven {
        url "https://dl.bintray.com/strangeway-org/libs" 
    }
}

dependencies {
    testImplementation "org.strangeway:selenide-kelt:1.0.1"
}
```

## Examples:

1. Get element by any of standard By (with named arguments instead of By):
    ```kotlin
    open("/login")
   
    // search by CSS as simple as possible:
    elt("#submit").click()
   
    // or you may specify selector explicitly:    
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
   elt(tag = "header").elts(cssClass = "item").shouldHave(size(5))
   ```

2. Build PageObject classes easier:
    ```kotlin
    import org.strangeway.kelt.*
   
    class GoogleResultsPage {
        val results = elt(id = "results")
    }
    
    class GoogleSearchPage {
        private val searchBox = elt(name = "q")
    
        fun search(query: String): GoogleResultsPage {
            searchBox.setValue(query).pressEnter()
            return page() // no need to duplicate <GoogleResultsPage> type
        }
    }
   
    // ...
    openPage<GoogleSearchPage>("http://google.com").search("Selenide!")
   
    // get page on demand without opening
    val googlePage = page<GoogleResultsPage>()
    ```
    
    <a href="https://www.buymeacoffee.com/jreznot" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>
