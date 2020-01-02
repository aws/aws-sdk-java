/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHumanTaskUi" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHumanTaskUiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     */
    private String humanTaskUiName;

    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     * 
     * @param humanTaskUiName
     *        The name of the human task user interface you want information about.
     */

    public void setHumanTaskUiName(String humanTaskUiName) {
        this.humanTaskUiName = humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     * 
     * @return The name of the human task user interface you want information about.
     */

    public String getHumanTaskUiName() {
        return this.humanTaskUiName;
    }

    /**
     * <p>
     * The name of the human task user interface you want information about.
     * </p>
     * 
     * @param humanTaskUiName
     *        The name of the human task user interface you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHumanTaskUiRequest withHumanTaskUiName(String humanTaskUiName) {
        setHumanTaskUiName(humanTaskUiName);
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
        if (getHumanTaskUiName() != null)
            sb.append("HumanTaskUiName: ").append(getHumanTaskUiName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHumanTaskUiRequest == false)
            return false;
        DescribeHumanTaskUiRequest other = (DescribeHumanTaskUiRequest) obj;
        if (other.getHumanTaskUiName() == null ^ this.getHumanTaskUiName() == null)
            return false;
        if (other.getHumanTaskUiName() != null && other.getHumanTaskUiName().equals(this.getHumanTaskUiName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanTaskUiName() == null) ? 0 : getHumanTaskUiName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHumanTaskUiRequest clone() {
        return (DescribeHumanTaskUiRequest) super.clone();
    }

}
