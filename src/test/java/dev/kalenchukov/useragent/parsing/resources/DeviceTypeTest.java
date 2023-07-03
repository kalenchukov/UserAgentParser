/*
 * Copyright © 2023 Алексей Каленчуков
 * GitHub: https://github.com/kalenchukov
 * E-mail: mailto:aleksey.kalenchukov@yandex.ru
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.kalenchukov.useragent.parsing.resources;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс проверки методов перечисления {@link DeviceType}.
 *
 * @author Алексей Каленчуков
 */
public class DeviceTypeTest
{
    /**
     * Проверка метода {@link DeviceType#getType()}.
     */
    @Test
    public void getType()
    {
        DeviceType deviceType = DeviceType.MOBILE;

        String actualType = deviceType.getType();

        assertThat(actualType).isEqualTo("Mobile");
    }

    /**
     * Класс проверки статических методов.
     *
     * @author Алексей Каленчуков
     */
    @Nested
    public class Static
    {
        /**
         * Проверка метода {@link DeviceType#getAll()}.
         */
        @Test
        public void getAll()
        {
            List<String> devices = DeviceType.getAll();
            // Отнимается 1 так как в результат DeviceType.getAll() не попадает DeviceType.UNKNOWN
            int expectedSize = DeviceType.values().length - 1;

            int actualSize = devices.size();

            assertThat(actualSize).isEqualTo(expectedSize);
        }
    }
}