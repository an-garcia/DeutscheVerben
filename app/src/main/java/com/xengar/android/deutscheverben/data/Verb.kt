/*
 * Copyright (C) 2018 Angel Garcia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xengar.android.deutscheverben.data

import com.xengar.android.deutscheverben.data.VerbContract.VerbEntry.Companion.TYPE_ALL
import com.xengar.android.deutscheverben.data.VerbContract.VerbEntry.Companion.OTHER

/**
 * Data that is contained for a verb item in the list mode in the main list.
 */
class Verb
/*** Constructor  */
(id: Long, conjugation: Int, image: String, infinitive: String,
 pastParticiple: String, presentHe: String, pastHe: String, definition: String,
 sample1: String, sample2: String, sample3: String,
 common: Int, type: Int, color: Int, score: Int, notes: String,
 translationEN: String, translationFR: String, translationES: String) {

    /* Getters and Setters */
    var id: Long = 0
    var conjugation = 0      // Conjugation id
    var image = ""
    var infinitive = ""
    var pastParticiple = ""
    var presentHe = ""
    var pastHe = ""
    var definition = ""
    var sample1 = ""
    var sample2 = ""
    var sample3 = ""
    var common = OTHER
    var type = TYPE_ALL
    var color = 0
    var score = 0
    var notes = ""
    var translationEN = ""
    var translationFR = ""
    var translationES = ""

    init {
        this.id = id
        this.conjugation = conjugation
        this.image = image
        this.infinitive = infinitive
        this.pastParticiple = pastParticiple
        this.presentHe = presentHe
        this.pastHe = pastHe
        this.definition = definition
        this.sample1 = sample1
        this.sample2 = sample2
        this.sample3 = sample3
        this.common = common
        this.type = type
        this.color = color
        this.score = score
        this.notes = notes
        this.translationEN = translationEN
        this.translationFR = translationFR
        this.translationES = translationES
    }

}
