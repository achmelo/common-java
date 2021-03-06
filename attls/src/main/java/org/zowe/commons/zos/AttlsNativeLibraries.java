/*
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Copyright Contributors to the Zowe Project.
 */
package org.zowe.commons.zos;

import org.zowe.commons.attls.AttlsContext;

import java.util.ArrayList;
import java.util.List;

public class AttlsNativeLibraries  {

    public List<String> getNativeLibrariesNames() {
        List<String> libraries = new ArrayList<>();
        libraries.add(AttlsContext.ATTLS_LIBRARY_NAME);
        return libraries;
    }

}
