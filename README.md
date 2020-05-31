# selenide-kelt

Extension functions to make Selenide tests with Kotlin awesome!

Examples:

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
    elts("#search-results a").findBy(text("selenide.org")).click()
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