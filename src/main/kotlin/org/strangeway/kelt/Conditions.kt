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
import com.codeborne.selenide.Condition
import com.codeborne.selenide.ElementsCollection
import com.codeborne.selenide.SelenideElement

infix fun SelenideElement.should(condition: Condition) = this.should(condition)
infix fun SelenideElement.shouldBe(condition: Condition) = this.shouldBe(condition)
infix fun SelenideElement.shouldHave(condition: Condition) = this.shouldHave(condition)

infix fun SelenideElement.shouldNot(condition: Condition) = this.shouldNot(condition)
infix fun SelenideElement.shouldNotBe(condition: Condition) = this.shouldNotBe(condition)
infix fun SelenideElement.shouldNotHave(condition: Condition) = this.shouldNotHave(condition)

infix fun ElementsCollection.shouldBe(condition: CollectionCondition) = this.shouldBe(condition)
infix fun ElementsCollection.shouldHave(condition: CollectionCondition) = this.shouldHave(condition)