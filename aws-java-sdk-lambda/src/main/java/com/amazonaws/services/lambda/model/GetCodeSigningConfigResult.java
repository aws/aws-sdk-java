/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetCodeSigningConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCodeSigningConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The code signing configuration
     * </p>
     */
    private CodeSigningConfig codeSigningConfig;

    /**
     * <p>
     * The code signing configuration
     * </p>
     * 
     * @param codeSigningConfig
     *        The code signing configuration
     */

    public void setCodeSigningConfig(CodeSigningConfig codeSigningConfig) {
        this.codeSigningConfig = codeSigningConfig;
    }

    /**
     * <p>
     * The code signing configuration
     * </p>
     * 
     * @return The code signing configuration
     */

    public CodeSigningConfig getCodeSigningConfig() {
        return this.codeSigningConfig;
    }

    /**
     * <p>
     * The code signing configuration
     * </p>
     * 
     * @param codeSigningConfig
     *        The code signing configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCodeSigningConfigResult withCodeSigningConfig(CodeSigningConfig codeSigningConfig) {
        setCodeSigningConfig(codeSigningConfig);
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
        if (getCodeSigningConfig() != null)
            sb.append("CodeSigningConfig: ").append(getCodeSigningConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCodeSigningConfigResult == false)
            return false;
        GetCodeSigningConfigResult other = (GetCodeSigningConfigResult) obj;
        if (other.getCodeSigningConfig() == null ^ this.getCodeSigningConfig() == null)
            return false;
        if (other.getCodeSigningConfig() != null && other.getCodeSigningConfig().equals(this.getCodeSigningConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeSigningConfig() == null) ? 0 : getCodeSigningConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetCodeSigningConfigResult clone() {
        try {
            return (GetCodeSigningConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
