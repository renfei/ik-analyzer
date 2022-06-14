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
package org.wltea.analyzer.test;

import junit.framework.TestCase;
import org.wltea.analyzer.dic.CustomDictionary;
import org.wltea.analyzer.dic.Dictionary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author renfei
 */
public class LoadCustomDictionaryTest extends TestCase {

    public void testLoadCustomDictionary() throws FileNotFoundException {
        Dictionary dictionary = Dictionary.getInstance();
        if (!dictionary.isLoadedCustomDictionary()) {
            // 没有加载自定义词典，加载自定义词典
            // https://github.com/renfei/dict
            CustomDictionary customDictionary = new CustomDictionary();
            // customDictionary.setMainDictInputStream(new FileInputStream("/Users/renfei/Downloads/sogou.txt"));
            dictionary.loadCustomDictionary(customDictionary);
        }
    }
}
