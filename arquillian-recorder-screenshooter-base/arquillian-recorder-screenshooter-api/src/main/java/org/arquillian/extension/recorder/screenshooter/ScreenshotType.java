/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.arquillian.extension.recorder.screenshooter;

import org.arquillian.extension.recorder.ResourceType;

/**
 * All sensible file extensions for taken screenshots.
 *
 * @author <a href="mailto:smikloso@redhat.com">Stefan Miklosovic</a>
 *
 */
public enum ScreenshotType implements ResourceType {

    JPEG("jpeg"),
    PNG("png"),
    BMP("bmp"),
    WBMP("wbmp"),
    GIF("gif");

    private String name;

    private ScreenshotType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     *
     * @return all screenshot types concatenated to one string separated only by one space from each other
     */
    public static String getAll() {
        StringBuilder sb = new StringBuilder();

        for (ScreenshotType screenshotType : ScreenshotType.values()) {
            sb.append(screenshotType.toString());
            sb.append(" ");
        }

        return sb.toString().trim();
    }

}