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
            sb.append("InputFileUri: ").append(getInputFileUri());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmznClientToken() == null) ? 0 : getAmznClientToken().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getInputFileUri() == null) ? 0 : getInputFileUri().hashCode());
        return hashCode;
    }

    @Override
    public StartBulkDeploymentRequest clone() {
        return (StartBulkDeploymentRequest) super.clone();
    }

}
