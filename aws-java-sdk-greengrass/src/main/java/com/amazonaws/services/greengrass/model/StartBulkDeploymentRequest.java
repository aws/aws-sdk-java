/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/StartBulkDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBulkDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A client token used to correlate requests and responses. */
    private String amznClientToken;
    /**
     * The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow the
     * ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This IAM role
     * must have access to the S3 bucket containing the input file.
     */
    private String executionRoleArn;
    /**
     * The URI of the input file contained in the S3 bucket. The execution role must have ''getObject'' permissions on
     * this bucket to access the input file. The input file is a JSON-serialized, line delimited file with UTF-8
     * encoding that provides a list of group and version IDs and the deployment type. This file must be less than 100
     * MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
     */
    private String inputFileUri;
    /** Tag(s) to add to the new resource */
    private java.util.Map<String, String> tags;

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     */

    public void setAmznClientToken(String amznClientToken) {
        this.amznClientToken = amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @return A client token used to correlate requests and responses.
     */

    public String getAmznClientToken() {
        return this.amznClientToken;
    }

    /**
     * A client token used to correlate requests and responses.
     * 
     * @param amznClientToken
     *        A client token used to correlate requests and responses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBulkDeploymentRequest withAmznClientToken(String amznClientToken) {
        setAmznClientToken(amznClientToken);
        return this;
    }

    /**
     * The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow the
     * ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This IAM role
     * must have access to the S3 bucket containing the input file.
     * 
     * @param executionRoleArn
     *        The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow
     *        the ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This
     *        IAM role must have access to the S3 bucket containing the input file.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow the
     * ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This IAM role
     * must have access to the S3 bucket containing the input file.
     * 
     * @return The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow
     *         the ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This
     *         IAM role must have access to the S3 bucket containing the input file.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow the
     * ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This IAM role
     * must have access to the S3 bucket containing the input file.
     * 
     * @param executionRoleArn
     *        The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow
     *        the ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This
     *        IAM role must have access to the S3 bucket containing the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBulkDeploymentRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * The URI of the input file contained in the S3 bucket. The execution role must have ''getObject'' permissions on
     * this bucket to access the input file. The input file is a JSON-serialized, line delimited file with UTF-8
     * encoding that provides a list of group and version IDs and the deployment type. This file must be less than 100
     * MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
     * 
     * @param inputFileUri
     *        The URI of the input file contained in the S3 bucket. The execution role must have ''getObject''
     *        permissions on this bucket to access the input file. The input file is a JSON-serialized, line delimited
     *        file with UTF-8 encoding that provides a list of group and version IDs and the deployment type. This file
     *        must be less than 100 MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
     */

    public void setInputFileUri(String inputFileUri) {
        this.inputFileUri = inputFileUri;
    }

    /**
     * The URI of the input file contained in the S3 bucket. The execution role must have ''getObject'' permissions on
     * this bucket to access the input file. The input file is a JSON-serialized, line delimited file with UTF-8
     * encoding that provides a list of group and version IDs and the deployment type. This file must be less than 100
     * MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
     * 
     * @return The URI of the input file contained in the S3 bucket. The execution role must have ''getObject''
     *         permissions on this bucket to access the input file. The input file is a JSON-serialized, line delimited
     *         file with UTF-8 encoding that provides a list of group and version IDs and the deployment type. This file
     *         must be less than 100 MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
     */

    public String getInputFileUri() {
        return this.inputFileUri;
    }

    /**
     * The URI of the input file contained in the S3 bucket. The execution role must have ''getObject'' permissions on
     * this bucket to access the input file. The input file is a JSON-serialized, line delimited file with UTF-8
     * encoding that provides a list of group and version IDs and the deployment type. This file must be less than 100
     * MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
     * 
     * @param inputFileUri
     *        The URI of the input file contained in the S3 bucket. The execution role must have ''getObject''
     *        permissions on this bucket to access the input file. The input file is a JSON-serialized, line delimited
     *        file with UTF-8 encoding that provides a list of group and version IDs and the deployment type. This file
     *        must be less than 100 MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBulkDeploymentRequest withInputFileUri(String inputFileUri) {
        setInputFileUri(inputFileUri);
        return this;
    }

    /**
     * Tag(s) to add to the new resource
     * 
     * @return Tag(s) to add to the new resource
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * Tag(s) to add to the new resource
     * 
     * @param tags
     *        Tag(s) to add to the new resource
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * Tag(s) to add to the new resource
     * 
     * @param tags
     *        Tag(s) to add to the new resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBulkDeploymentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public StartBulkDeploymentRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBulkDeploymentRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAmznClientToken() != null)
            sb.append("AmznClientToken: ").append(getAmznClientToken()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getInputFileUri() != null)
            sb.append("InputFileUri: ").append(getInputFileUri()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBulkDeploymentRequest == false)
            return false;
        StartBulkDeploymentRequest other = (StartBulkDeploymentRequest) obj;
        if (other.getAmznClientToken() == null ^ this.getAmznClientToken() == null)
            return false;
        if (other.getAmznClientToken() != null && other.getAmznClientToken().equals(this.getAmznClientToken()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getInputFileUri() == null ^ this.getInputFileUri() == null)
            return false;
        if (other.getInputFileUri() != null && other.getInputFileUri().equals(this.getInputFileUri()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputFileUri() == null) ? 0 : getInputFileUri().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartBulkDeploymentRequest clone() {
        return (StartBulkDeploymentRequest) super.clone();
    }

}
