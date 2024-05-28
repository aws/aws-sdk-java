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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeApplications" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of one or more applications.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> applicationIds;
    /**
     * <p>
     * The compute types supported by the applications.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> computeTypeNames;
    /**
     * <p>
     * The license availability for the applications.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The operating systems supported by the applications.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> operatingSystemNames;
    /**
     * <p>
     * The owner of the applications.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifiers of one or more applications.
     * </p>
     * 
     * @return The identifiers of one or more applications.
     */

    public java.util.List<String> getApplicationIds() {
        if (applicationIds == null) {
            applicationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return applicationIds;
    }

    /**
     * <p>
     * The identifiers of one or more applications.
     * </p>
     * 
     * @param applicationIds
     *        The identifiers of one or more applications.
     */

    public void setApplicationIds(java.util.Collection<String> applicationIds) {
        if (applicationIds == null) {
            this.applicationIds = null;
            return;
        }

        this.applicationIds = new com.amazonaws.internal.SdkInternalList<String>(applicationIds);
    }

    /**
     * <p>
     * The identifiers of one or more applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationIds(java.util.Collection)} or {@link #withApplicationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param applicationIds
     *        The identifiers of one or more applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationsRequest withApplicationIds(String... applicationIds) {
        if (this.applicationIds == null) {
            setApplicationIds(new com.amazonaws.internal.SdkInternalList<String>(applicationIds.length));
        }
        for (String ele : applicationIds) {
            this.applicationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of one or more applications.
     * </p>
     * 
     * @param applicationIds
     *        The identifiers of one or more applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationsRequest withApplicationIds(java.util.Collection<String> applicationIds) {
        setApplicationIds(applicationIds);
        return this;
    }

    /**
     * <p>
     * The compute types supported by the applications.
     * </p>
     * 
     * @return The compute types supported by the applications.
     * @see Compute
     */

    public java.util.List<String> getComputeTypeNames() {
        if (computeTypeNames == null) {
            computeTypeNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return computeTypeNames;
    }

    /**
     * <p>
     * The compute types supported by the applications.
     * </p>
     * 
     * @param computeTypeNames
     *        The compute types supported by the applications.
     * @see Compute
     */

    public void setComputeTypeNames(java.util.Collection<String> computeTypeNames) {
        if (computeTypeNames == null) {
            this.computeTypeNames = null;
            return;
        }

        this.computeTypeNames = new com.amazonaws.internal.SdkInternalList<String>(computeTypeNames);
    }

    /**
     * <p>
     * The compute types supported by the applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeTypeNames(java.util.Collection)} or {@link #withComputeTypeNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param computeTypeNames
     *        The compute types supported by the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public DescribeApplicationsRequest withComputeTypeNames(String... computeTypeNames) {
        if (this.computeTypeNames == null) {
            setComputeTypeNames(new com.amazonaws.internal.SdkInternalList<String>(computeTypeNames.length));
        }
        for (String ele : computeTypeNames) {
            this.computeTypeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The compute types supported by the applications.
     * </p>
     * 
     * @param computeTypeNames
     *        The compute types supported by the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public DescribeApplicationsRequest withComputeTypeNames(java.util.Collection<String> computeTypeNames) {
        setComputeTypeNames(computeTypeNames);
        return this;
    }

    /**
     * <p>
     * The compute types supported by the applications.
     * </p>
     * 
     * @param computeTypeNames
     *        The compute types supported by the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Compute
     */

    public DescribeApplicationsRequest withComputeTypeNames(Compute... computeTypeNames) {
        com.amazonaws.internal.SdkInternalList<String> computeTypeNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(computeTypeNames.length);
        for (Compute value : computeTypeNames) {
            computeTypeNamesCopy.add(value.toString());
        }
        if (getComputeTypeNames() == null) {
            setComputeTypeNames(computeTypeNamesCopy);
        } else {
            getComputeTypeNames().addAll(computeTypeNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @param licenseType
     *        The license availability for the applications.
     * @see WorkSpaceApplicationLicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @return The license availability for the applications.
     * @see WorkSpaceApplicationLicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @param licenseType
     *        The license availability for the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceApplicationLicenseType
     */

    public DescribeApplicationsRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The license availability for the applications.
     * </p>
     * 
     * @param licenseType
     *        The license availability for the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkSpaceApplicationLicenseType
     */

    public DescribeApplicationsRequest withLicenseType(WorkSpaceApplicationLicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The operating systems supported by the applications.
     * </p>
     * 
     * @return The operating systems supported by the applications.
     * @see OperatingSystemName
     */

    public java.util.List<String> getOperatingSystemNames() {
        if (operatingSystemNames == null) {
            operatingSystemNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return operatingSystemNames;
    }

    /**
     * <p>
     * The operating systems supported by the applications.
     * </p>
     * 
     * @param operatingSystemNames
     *        The operating systems supported by the applications.
     * @see OperatingSystemName
     */

    public void setOperatingSystemNames(java.util.Collection<String> operatingSystemNames) {
        if (operatingSystemNames == null) {
            this.operatingSystemNames = null;
            return;
        }

        this.operatingSystemNames = new com.amazonaws.internal.SdkInternalList<String>(operatingSystemNames);
    }

    /**
     * <p>
     * The operating systems supported by the applications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperatingSystemNames(java.util.Collection)} or {@link #withOperatingSystemNames(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param operatingSystemNames
     *        The operating systems supported by the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemName
     */

    public DescribeApplicationsRequest withOperatingSystemNames(String... operatingSystemNames) {
        if (this.operatingSystemNames == null) {
            setOperatingSystemNames(new com.amazonaws.internal.SdkInternalList<String>(operatingSystemNames.length));
        }
        for (String ele : operatingSystemNames) {
            this.operatingSystemNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating systems supported by the applications.
     * </p>
     * 
     * @param operatingSystemNames
     *        The operating systems supported by the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemName
     */

    public DescribeApplicationsRequest withOperatingSystemNames(java.util.Collection<String> operatingSystemNames) {
        setOperatingSystemNames(operatingSystemNames);
        return this;
    }

    /**
     * <p>
     * The operating systems supported by the applications.
     * </p>
     * 
     * @param operatingSystemNames
     *        The operating systems supported by the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystemName
     */

    public DescribeApplicationsRequest withOperatingSystemNames(OperatingSystemName... operatingSystemNames) {
        com.amazonaws.internal.SdkInternalList<String> operatingSystemNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                operatingSystemNames.length);
        for (OperatingSystemName value : operatingSystemNames) {
            operatingSystemNamesCopy.add(value.toString());
        }
        if (getOperatingSystemNames() == null) {
            setOperatingSystemNames(operatingSystemNamesCopy);
        } else {
            getOperatingSystemNames().addAll(operatingSystemNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The owner of the applications.
     * </p>
     * 
     * @param owner
     *        The owner of the applications.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the applications.
     * </p>
     * 
     * @return The owner of the applications.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the applications.
     * </p>
     * 
     * @param owner
     *        The owner of the applications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationsRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of applications to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     * 
     * @return The maximum number of applications to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of applications to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of applications to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @return If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to receive
     * the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If you received a <code>NextToken</code> from a previous call that was paginated, provide this token to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeApplicationsRequest withNextToken(String nextToken) {
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
        if (getApplicationIds() != null)
            sb.append("ApplicationIds: ").append(getApplicationIds()).append(",");
        if (getComputeTypeNames() != null)
            sb.append("ComputeTypeNames: ").append(getComputeTypeNames()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getOperatingSystemNames() != null)
            sb.append("OperatingSystemNames: ").append(getOperatingSystemNames()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
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

        if (obj instanceof DescribeApplicationsRequest == false)
            return false;
        DescribeApplicationsRequest other = (DescribeApplicationsRequest) obj;
        if (other.getApplicationIds() == null ^ this.getApplicationIds() == null)
            return false;
        if (other.getApplicationIds() != null && other.getApplicationIds().equals(this.getApplicationIds()) == false)
            return false;
        if (other.getComputeTypeNames() == null ^ this.getComputeTypeNames() == null)
            return false;
        if (other.getComputeTypeNames() != null && other.getComputeTypeNames().equals(this.getComputeTypeNames()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getOperatingSystemNames() == null ^ this.getOperatingSystemNames() == null)
            return false;
        if (other.getOperatingSystemNames() != null && other.getOperatingSystemNames().equals(this.getOperatingSystemNames()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
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

        hashCode = prime * hashCode + ((getApplicationIds() == null) ? 0 : getApplicationIds().hashCode());
        hashCode = prime * hashCode + ((getComputeTypeNames() == null) ? 0 : getComputeTypeNames().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystemNames() == null) ? 0 : getOperatingSystemNames().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeApplicationsRequest clone() {
        return (DescribeApplicationsRequest) super.clone();
    }

}
