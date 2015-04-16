/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#describeDataset(DescribeDatasetRequest) DescribeDataset operation}.
 * <p>
 * Gets meta data about a dataset by identity and dataset name. With
 * Amazon Cognito Sync, each identity has access only to its own data.
 * Thus, the credentials used to make this API call need to have access
 * to the identity data.
 * </p>
 * <p>
 * DescribeDataset can be called with temporary user credentials provided
 * by Cognito Identity or with developer credentials. You should use
 * Cognito Identity credentials to make this API call.
 * </p>
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#describeDataset(DescribeDatasetRequest)
 */
public class DescribeDatasetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityPoolId;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     */
    private String datasetName;

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityPoolId() {
        return identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityPoolId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDatasetRequest withIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
        return this;
    }

    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A name-spaced GUID (for example,
     * us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     * Cognito. GUID generation is unique within a region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A name-spaced GUID (for example,
     *         us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDatasetRequest withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @return A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     */
    public String getDatasetName() {
        return datasetName;
    }
    
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     */
    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }
    
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z,
     * 0-9, '_' (underscore), '-' (dash), and '.' (dot).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.:-]+<br/>
     *
     * @param datasetName A string of up to 128 characters. Allowed characters are a-z, A-Z,
     *         0-9, '_' (underscore), '-' (dash), and '.' (dot).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDatasetRequest withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityPoolId() != null) sb.append("IdentityPoolId: " + getIdentityPoolId() + ",");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getDatasetName() != null) sb.append("DatasetName: " + getDatasetName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDatasetRequest == false) return false;
        DescribeDatasetRequest other = (DescribeDatasetRequest)obj;
        
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null) return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false) return false; 
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getDatasetName() == null ^ this.getDatasetName() == null) return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDatasetRequest clone() {
        
            return (DescribeDatasetRequest) super.clone();
    }

}
    