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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/ListSolFunctionPackages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolFunctionPackagesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a
     * network function (an ETSI standard telecommunication application) and function package descriptor that uses the
     * TOSCA standard to describe how the network functions should run on your network.
     * </p>
     */
    private java.util.List<ListSolFunctionPackageInfo> functionPackages;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a
     * network function (an ETSI standard telecommunication application) and function package descriptor that uses the
     * TOSCA standard to describe how the network functions should run on your network.
     * </p>
     * 
     * @return Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains
     *         a network function (an ETSI standard telecommunication application) and function package descriptor that
     *         uses the TOSCA standard to describe how the network functions should run on your network.
     */

    public java.util.List<ListSolFunctionPackageInfo> getFunctionPackages() {
        return functionPackages;
    }

    /**
     * <p>
     * Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a
     * network function (an ETSI standard telecommunication application) and function package descriptor that uses the
     * TOSCA standard to describe how the network functions should run on your network.
     * </p>
     * 
     * @param functionPackages
     *        Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains
     *        a network function (an ETSI standard telecommunication application) and function package descriptor that
     *        uses the TOSCA standard to describe how the network functions should run on your network.
     */

    public void setFunctionPackages(java.util.Collection<ListSolFunctionPackageInfo> functionPackages) {
        if (functionPackages == null) {
            this.functionPackages = null;
            return;
        }

        this.functionPackages = new java.util.ArrayList<ListSolFunctionPackageInfo>(functionPackages);
    }

    /**
     * <p>
     * Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a
     * network function (an ETSI standard telecommunication application) and function package descriptor that uses the
     * TOSCA standard to describe how the network functions should run on your network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFunctionPackages(java.util.Collection)} or {@link #withFunctionPackages(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param functionPackages
     *        Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains
     *        a network function (an ETSI standard telecommunication application) and function package descriptor that
     *        uses the TOSCA standard to describe how the network functions should run on your network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionPackagesResult withFunctionPackages(ListSolFunctionPackageInfo... functionPackages) {
        if (this.functionPackages == null) {
            setFunctionPackages(new java.util.ArrayList<ListSolFunctionPackageInfo>(functionPackages.length));
        }
        for (ListSolFunctionPackageInfo ele : functionPackages) {
            this.functionPackages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains a
     * network function (an ETSI standard telecommunication application) and function package descriptor that uses the
     * TOSCA standard to describe how the network functions should run on your network.
     * </p>
     * 
     * @param functionPackages
     *        Function packages. A function package is a .zip file in CSAR (Cloud Service Archive) format that contains
     *        a network function (an ETSI standard telecommunication application) and function package descriptor that
     *        uses the TOSCA standard to describe how the network functions should run on your network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionPackagesResult withFunctionPackages(java.util.Collection<ListSolFunctionPackageInfo> functionPackages) {
        setFunctionPackages(functionPackages);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSolFunctionPackagesResult withNextToken(String nextToken) {
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
        if (getFunctionPackages() != null)
            sb.append("FunctionPackages: ").append(getFunctionPackages()).append(",");
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

        if (obj instanceof ListSolFunctionPackagesResult == false)
            return false;
        ListSolFunctionPackagesResult other = (ListSolFunctionPackagesResult) obj;
        if (other.getFunctionPackages() == null ^ this.getFunctionPackages() == null)
            return false;
        if (other.getFunctionPackages() != null && other.getFunctionPackages().equals(this.getFunctionPackages()) == false)
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

        hashCode = prime * hashCode + ((getFunctionPackages() == null) ? 0 : getFunctionPackages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSolFunctionPackagesResult clone() {
        try {
            return (ListSolFunctionPackagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
