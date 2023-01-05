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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetInstanceTypesFromInstanceRequirementsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceTypesFromInstanceRequirementsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetInstanceTypesFromInstanceRequirementsRequest> {

    /**
     * <p>
     * The processor architecture type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> architectureTypes;
    /**
     * <p>
     * The virtualization type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> virtualizationTypes;
    /**
     * <p>
     * The attributes required for the instance types.
     * </p>
     */
    private InstanceRequirementsRequest instanceRequirements;
    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The processor architecture type.
     * </p>
     * 
     * @return The processor architecture type.
     * @see ArchitectureType
     */

    public java.util.List<String> getArchitectureTypes() {
        if (architectureTypes == null) {
            architectureTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return architectureTypes;
    }

    /**
     * <p>
     * The processor architecture type.
     * </p>
     * 
     * @param architectureTypes
     *        The processor architecture type.
     * @see ArchitectureType
     */

    public void setArchitectureTypes(java.util.Collection<String> architectureTypes) {
        if (architectureTypes == null) {
            this.architectureTypes = null;
            return;
        }

        this.architectureTypes = new com.amazonaws.internal.SdkInternalList<String>(architectureTypes);
    }

    /**
     * <p>
     * The processor architecture type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArchitectureTypes(java.util.Collection)} or {@link #withArchitectureTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param architectureTypes
     *        The processor architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withArchitectureTypes(String... architectureTypes) {
        if (this.architectureTypes == null) {
            setArchitectureTypes(new com.amazonaws.internal.SdkInternalList<String>(architectureTypes.length));
        }
        for (String ele : architectureTypes) {
            this.architectureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The processor architecture type.
     * </p>
     * 
     * @param architectureTypes
     *        The processor architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withArchitectureTypes(java.util.Collection<String> architectureTypes) {
        setArchitectureTypes(architectureTypes);
        return this;
    }

    /**
     * <p>
     * The processor architecture type.
     * </p>
     * 
     * @param architectureTypes
     *        The processor architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureType
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withArchitectureTypes(ArchitectureType... architectureTypes) {
        com.amazonaws.internal.SdkInternalList<String> architectureTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(architectureTypes.length);
        for (ArchitectureType value : architectureTypes) {
            architectureTypesCopy.add(value.toString());
        }
        if (getArchitectureTypes() == null) {
            setArchitectureTypes(architectureTypesCopy);
        } else {
            getArchitectureTypes().addAll(architectureTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @return The virtualization type.
     * @see VirtualizationType
     */

    public java.util.List<String> getVirtualizationTypes() {
        if (virtualizationTypes == null) {
            virtualizationTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return virtualizationTypes;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @see VirtualizationType
     */

    public void setVirtualizationTypes(java.util.Collection<String> virtualizationTypes) {
        if (virtualizationTypes == null) {
            this.virtualizationTypes = null;
            return;
        }

        this.virtualizationTypes = new com.amazonaws.internal.SdkInternalList<String>(virtualizationTypes);
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualizationTypes(java.util.Collection)} or {@link #withVirtualizationTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withVirtualizationTypes(String... virtualizationTypes) {
        if (this.virtualizationTypes == null) {
            setVirtualizationTypes(new com.amazonaws.internal.SdkInternalList<String>(virtualizationTypes.length));
        }
        for (String ele : virtualizationTypes) {
            this.virtualizationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withVirtualizationTypes(java.util.Collection<String> virtualizationTypes) {
        setVirtualizationTypes(virtualizationTypes);
        return this;
    }

    /**
     * <p>
     * The virtualization type.
     * </p>
     * 
     * @param virtualizationTypes
     *        The virtualization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withVirtualizationTypes(VirtualizationType... virtualizationTypes) {
        com.amazonaws.internal.SdkInternalList<String> virtualizationTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(virtualizationTypes.length);
        for (VirtualizationType value : virtualizationTypes) {
            virtualizationTypesCopy.add(value.toString());
        }
        if (getVirtualizationTypes() == null) {
            setVirtualizationTypes(virtualizationTypesCopy);
        } else {
            getVirtualizationTypes().addAll(virtualizationTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The attributes required for the instance types.
     * </p>
     * 
     * @param instanceRequirements
     *        The attributes required for the instance types.
     */

    public void setInstanceRequirements(InstanceRequirementsRequest instanceRequirements) {
        this.instanceRequirements = instanceRequirements;
    }

    /**
     * <p>
     * The attributes required for the instance types.
     * </p>
     * 
     * @return The attributes required for the instance types.
     */

    public InstanceRequirementsRequest getInstanceRequirements() {
        return this.instanceRequirements;
    }

    /**
     * <p>
     * The attributes required for the instance types.
     * </p>
     * 
     * @param instanceRequirements
     *        The attributes required for the instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withInstanceRequirements(InstanceRequirementsRequest instanceRequirements) {
        setInstanceRequirements(instanceRequirements);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The
     *        default value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     *        <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The
     *         default value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     *         <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The default
     * value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     * <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 1 and&#x2028; 1000. The
     *        default value is 1000. To retrieve the remaining results, make another call with&#x2028; the returned
     *        <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTypesFromInstanceRequirementsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetInstanceTypesFromInstanceRequirementsRequest> getDryRunRequest() {
        Request<GetInstanceTypesFromInstanceRequirementsRequest> request = new GetInstanceTypesFromInstanceRequirementsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getArchitectureTypes() != null)
            sb.append("ArchitectureTypes: ").append(getArchitectureTypes()).append(",");
        if (getVirtualizationTypes() != null)
            sb.append("VirtualizationTypes: ").append(getVirtualizationTypes()).append(",");
        if (getInstanceRequirements() != null)
            sb.append("InstanceRequirements: ").append(getInstanceRequirements()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetInstanceTypesFromInstanceRequirementsRequest == false)
            return false;
        GetInstanceTypesFromInstanceRequirementsRequest other = (GetInstanceTypesFromInstanceRequirementsRequest) obj;
        if (other.getArchitectureTypes() == null ^ this.getArchitectureTypes() == null)
            return false;
        if (other.getArchitectureTypes() != null && other.getArchitectureTypes().equals(this.getArchitectureTypes()) == false)
            return false;
        if (other.getVirtualizationTypes() == null ^ this.getVirtualizationTypes() == null)
            return false;
        if (other.getVirtualizationTypes() != null && other.getVirtualizationTypes().equals(this.getVirtualizationTypes()) == false)
            return false;
        if (other.getInstanceRequirements() == null ^ this.getInstanceRequirements() == null)
            return false;
        if (other.getInstanceRequirements() != null && other.getInstanceRequirements().equals(this.getInstanceRequirements()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getArchitectureTypes() == null) ? 0 : getArchitectureTypes().hashCode());
        hashCode = prime * hashCode + ((getVirtualizationTypes() == null) ? 0 : getVirtualizationTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceRequirements() == null) ? 0 : getInstanceRequirements().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceTypesFromInstanceRequirementsRequest clone() {
        return (GetInstanceTypesFromInstanceRequirementsRequest) super.clone();
    }
}
