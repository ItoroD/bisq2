/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.tools.theme.jmetro;

import javafx.application.Application;
// Requires a gradle build for first run so that resource is in deployment directory
// Just temp as example for using an external theme
public class JMetroThemeDemoMain {
    public static void main(String[] args) {
        new Thread(() -> {
            Application.launch(JMetroThemeDemoApp.class, args); //blocks until app is closed
        }).start();
    }
}