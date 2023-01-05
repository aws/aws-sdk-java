/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExtensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     */
    private String extensionIdentifier;
    /**
     * <p>
     * The extension version number. If no version number was defined, AppConfig uses the highest version.
     * </p>
     */
    private Integer versionNumber;

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public void setExtensionIdentifier(String extensionIdentifier) {
        this.extensionIdentifier = extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @return The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public String getExtensionIdentifier() {
        return this.extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExtensionRequest withExtensionIdentifier(String extensionIdentifier) {
        setExtensionIdentifier(extensionIdentifier);
        return this;
    }

    /**
     * <p>
     * The extension version number. If no version number was defined, AppConfig uses the highest version.
     * </p>
     * 
     * @param versionNumber
     *        The extension version number. If no version number was defined, AppConfig uses the highest version.
     */

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The extension version number. If no version number was defined, AppConfig uses the highest version.
     * </p>
     * 
     * @return The extension version number. If no version number was defined, AppConfig uses the highest version.
     */

    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The extension version number. If no version number was defined, AppConfig uses the highest version.
     * </p>
     * 
     * @param versionNumber
     *        The extension version number. If no version number was defined, AppConfig uses the highest version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExtensionRequest withVersionNumber(Integer versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExtensionIdentifier() != null)
            sb.append("ExtensionIdentifier: ").append(getExtensionIdentifier()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExtensionRequest == false)
            return false;
        GetExtensionRequest other = (GetExtensionRequest) obj;
        if (other.getExtensionIdentifier() == null ^ this.getExtensionIdentifier() == null)
            return false;
        if (other.getExtensionIdentifier() != null && other.getExtensionIdentifier().equals(this.getExtensionIdentifier()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtensionIdentifier() == null) ? 0 : getExtensionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public GetExtensionRequest clone() {
        return (GetExtensionRequest) super.clone();
    }

}
