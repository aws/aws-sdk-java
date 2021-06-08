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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAppImageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppImageConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     */
    private String appImageConfigArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     * 
     * @param appImageConfigArn
     *        The Amazon Resource Name (ARN) of the AppImageConfig.
     */

    public void setAppImageConfigArn(String appImageConfigArn) {
        this.appImageConfigArn = appImageConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AppImageConfig.
     */

    public String getAppImageConfigArn() {
        return this.appImageConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AppImageConfig.
     * </p>
     * 
     * @param appImageConfigArn
     *        The Amazon Resource Name (ARN) of the AppImageConfig.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppImageConfigResult withAppImageConfigArn(String appImageConfigArn) {
        setAppImageConfigArn(appImageConfigArn);
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
        if (getAppImageConfigArn() != null)
            sb.append("AppImageConfigArn: ").append(getAppImageConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppImageConfigResult == false)
            return false;
        CreateAppImageConfigResult other = (CreateAppImageConfigResult) obj;
        if (other.getAppImageConfigArn() == null ^ this.getAppImageConfigArn() == null)
            return false;
        if (other.getAppImageConfigArn() != null && other.getAppImageConfigArn().equals(this.getAppImageConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppImageConfigArn() == null) ? 0 : getAppImageConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppImageConfigResult clone() {
        try {
            return (CreateAppImageConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
