/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/DisassociateAppBlockBuilderAppBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateAppBlockBuilderAppBlockRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     */
    private String appBlockArn;
    /**
     * <p>
     * The name of the app block builder.
     * </p>
     */
    private String appBlockBuilderName;

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @param appBlockArn
     *        The ARN of the app block.
     */

    public void setAppBlockArn(String appBlockArn) {
        this.appBlockArn = appBlockArn;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @return The ARN of the app block.
     */

    public String getAppBlockArn() {
        return this.appBlockArn;
    }

    /**
     * <p>
     * The ARN of the app block.
     * </p>
     * 
     * @param appBlockArn
     *        The ARN of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAppBlockBuilderAppBlockRequest withAppBlockArn(String appBlockArn) {
        setAppBlockArn(appBlockArn);
        return this;
    }

    /**
     * <p>
     * The name of the app block builder.
     * </p>
     * 
     * @param appBlockBuilderName
     *        The name of the app block builder.
     */

    public void setAppBlockBuilderName(String appBlockBuilderName) {
        this.appBlockBuilderName = appBlockBuilderName;
    }

    /**
     * <p>
     * The name of the app block builder.
     * </p>
     * 
     * @return The name of the app block builder.
     */

    public String getAppBlockBuilderName() {
        return this.appBlockBuilderName;
    }

    /**
     * <p>
     * The name of the app block builder.
     * </p>
     * 
     * @param appBlockBuilderName
     *        The name of the app block builder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateAppBlockBuilderAppBlockRequest withAppBlockBuilderName(String appBlockBuilderName) {
        setAppBlockBuilderName(appBlockBuilderName);
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
        if (getAppBlockArn() != null)
            sb.append("AppBlockArn: ").append(getAppBlockArn()).append(",");
        if (getAppBlockBuilderName() != null)
            sb.append("AppBlockBuilderName: ").append(getAppBlockBuilderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateAppBlockBuilderAppBlockRequest == false)
            return false;
        DisassociateAppBlockBuilderAppBlockRequest other = (DisassociateAppBlockBuilderAppBlockRequest) obj;
        if (other.getAppBlockArn() == null ^ this.getAppBlockArn() == null)
            return false;
        if (other.getAppBlockArn() != null && other.getAppBlockArn().equals(this.getAppBlockArn()) == false)
            return false;
        if (other.getAppBlockBuilderName() == null ^ this.getAppBlockBuilderName() == null)
            return false;
        if (other.getAppBlockBuilderName() != null && other.getAppBlockBuilderName().equals(this.getAppBlockBuilderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBlockArn() == null) ? 0 : getAppBlockArn().hashCode());
        hashCode = prime * hashCode + ((getAppBlockBuilderName() == null) ? 0 : getAppBlockBuilderName().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateAppBlockBuilderAppBlockRequest clone() {
        return (DisassociateAppBlockBuilderAppBlockRequest) super.clone();
    }

}
