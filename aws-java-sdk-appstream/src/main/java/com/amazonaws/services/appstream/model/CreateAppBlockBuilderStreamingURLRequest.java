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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateAppBlockBuilderStreamingURL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppBlockBuilderStreamingURLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the app block builder.
     * </p>
     */
    private String appBlockBuilderName;
    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     */
    private Long validity;

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

    public CreateAppBlockBuilderStreamingURLRequest withAppBlockBuilderName(String appBlockBuilderName) {
        setAppBlockBuilderName(appBlockBuilderName);
        return this;
    }

    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     * 
     * @param validity
     *        The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds.
     *        The default is 3600 seconds.
     */

    public void setValidity(Long validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     * 
     * @return The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds.
     *         The default is 3600 seconds.
     */

    public Long getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The
     * default is 3600 seconds.
     * </p>
     * 
     * @param validity
     *        The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds.
     *        The default is 3600 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockBuilderStreamingURLRequest withValidity(Long validity) {
        setValidity(validity);
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
        if (getAppBlockBuilderName() != null)
            sb.append("AppBlockBuilderName: ").append(getAppBlockBuilderName()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppBlockBuilderStreamingURLRequest == false)
            return false;
        CreateAppBlockBuilderStreamingURLRequest other = (CreateAppBlockBuilderStreamingURLRequest) obj;
        if (other.getAppBlockBuilderName() == null ^ this.getAppBlockBuilderName() == null)
            return false;
        if (other.getAppBlockBuilderName() != null && other.getAppBlockBuilderName().equals(this.getAppBlockBuilderName()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBlockBuilderName() == null) ? 0 : getAppBlockBuilderName().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppBlockBuilderStreamingURLRequest clone() {
        return (CreateAppBlockBuilderStreamingURLRequest) super.clone();
    }

}
