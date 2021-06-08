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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetCodeSigningConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCodeSigningConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     */
    private String codeSigningConfigArn;

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigArn
     *        The The Amazon Resource Name (ARN) of the code signing configuration.
     */

    public void setCodeSigningConfigArn(String codeSigningConfigArn) {
        this.codeSigningConfigArn = codeSigningConfigArn;
    }

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     * 
     * @return The The Amazon Resource Name (ARN) of the code signing configuration.
     */

    public String getCodeSigningConfigArn() {
        return this.codeSigningConfigArn;
    }

    /**
     * <p>
     * The The Amazon Resource Name (ARN) of the code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigArn
     *        The The Amazon Resource Name (ARN) of the code signing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCodeSigningConfigRequest withCodeSigningConfigArn(String codeSigningConfigArn) {
        setCodeSigningConfigArn(codeSigningConfigArn);
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
        if (getCodeSigningConfigArn() != null)
            sb.append("CodeSigningConfigArn: ").append(getCodeSigningConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCodeSigningConfigRequest == false)
            return false;
        GetCodeSigningConfigRequest other = (GetCodeSigningConfigRequest) obj;
        if (other.getCodeSigningConfigArn() == null ^ this.getCodeSigningConfigArn() == null)
            return false;
        if (other.getCodeSigningConfigArn() != null && other.getCodeSigningConfigArn().equals(this.getCodeSigningConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeSigningConfigArn() == null) ? 0 : getCodeSigningConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public GetCodeSigningConfigRequest clone() {
        return (GetCodeSigningConfigRequest) super.clone();
    }

}
