/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ListComponentOutputs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComponentOutputsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the component whose outputs you want.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the component whose outputs you want.
     * </p>
     * 
     * @param componentName
     *        The name of the component whose outputs you want.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component whose outputs you want.
     * </p>
     * 
     * @return The name of the component whose outputs you want.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component whose outputs you want.
     * </p>
     * 
     * @param componentName
     *        The name of the component whose outputs you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentOutputsRequest withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next output in the array of outputs, after the list of outputs
     *        that was previously requested.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     * 
     * @return A token that indicates the location of the next output in the array of outputs, after the list of outputs
     *         that was previously requested.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates the location of the next output in the array of outputs, after the list of outputs that
     * was previously requested.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates the location of the next output in the array of outputs, after the list of outputs
     *        that was previously requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComponentOutputsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComponentOutputsRequest == false)
            return false;
        ListComponentOutputsRequest other = (ListComponentOutputsRequest) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListComponentOutputsRequest clone() {
        return (ListComponentOutputsRequest) super.clone();
    }

}
