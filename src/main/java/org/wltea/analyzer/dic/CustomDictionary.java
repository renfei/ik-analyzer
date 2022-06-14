/*
 *   Copyright 2022 RenFei(i@renfei.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wltea.analyzer.dic;

import java.io.InputStream;

/**
 * @author renfei
 */
public class CustomDictionary {
    private InputStream mainDictInputStream;
    private InputStream surnameDictInputStream;
    private InputStream quantifierDictInputStream;
    private InputStream suffixDictInputStream;
    private InputStream prepDictInputStream;
    private InputStream stopWordDictInputStream;

    public InputStream getMainDictInputStream() {
        return mainDictInputStream;
    }

    public void setMainDictInputStream(InputStream mainDictInputStream) {
        this.mainDictInputStream = mainDictInputStream;
    }

    public InputStream getSurnameDictInputStream() {
        return surnameDictInputStream;
    }

    public void setSurnameDictInputStream(InputStream surnameDictInputStream) {
        this.surnameDictInputStream = surnameDictInputStream;
    }

    public InputStream getQuantifierDictInputStream() {
        return quantifierDictInputStream;
    }

    public void setQuantifierDictInputStream(InputStream quantifierDictInputStream) {
        this.quantifierDictInputStream = quantifierDictInputStream;
    }

    public InputStream getSuffixDictInputStream() {
        return suffixDictInputStream;
    }

    public void setSuffixDictInputStream(InputStream suffixDictInputStream) {
        this.suffixDictInputStream = suffixDictInputStream;
    }

    public InputStream getPrepDictInputStream() {
        return prepDictInputStream;
    }

    public void setPrepDictInputStream(InputStream prepDictInputStream) {
        this.prepDictInputStream = prepDictInputStream;
    }

    public InputStream getStopWordDictInputStream() {
        return stopWordDictInputStream;
    }

    public void setStopWordDictInputStream(InputStream stopWordDictInputStream) {
        this.stopWordDictInputStream = stopWordDictInputStream;
    }
}
