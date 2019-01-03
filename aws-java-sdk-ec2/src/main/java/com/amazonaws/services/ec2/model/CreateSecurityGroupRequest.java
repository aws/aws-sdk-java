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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateSecurityGroupRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSecurityGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateSecurityGroupRequest> {

    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     */
    private String vpcId;

    /**
     * Default constructor for CreateSecurityGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateSecurityGroupRequest() {
    }

    /**
     * Constructs a new CreateSecurityGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param groupName
     *        The name of the security group.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     *        </p>
     *        <p>
     *        Constraints for EC2-Classic: ASCII characters
     *        </p>
     *        <p>
     *        Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * @param description
     *        A description for the security group. This is informational only.
     *        </p>
     *        <p>
     *        Constraints: Up to 255 characters in length
     *        </p>
     *        <p>
     *        Constraints for EC2-Classic: ASCII characters
     *        </p>
     *        <p>
     *        Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$
     **/
    public CreateSecurityGroupRequest(String groupName, String description) {
        setGroupName(groupName);
        setDescription(description);
    }

    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * 
     * @param description
     *        A description for the security group. This is informational only.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length
     *        </p>
     *        <p>
     *        Constraints for EC2-Classic: ASCII characters
     *        </p>
     *        <p>
     *        Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$
     **/

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * 
     * @return A description for the security group. This is informational only.</p>
     *         <p>
     *         Constraints: Up to 255 characters in length
     *         </p>
     *         <p>
     *         Constraints for EC2-Classic: ASCII characters
     *         </p>
     *         <p>
     *         Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$
     **/

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the security group. This is informational only.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * 
     * @param description
     *        A description for the security group. This is informational only.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length
     *        </p>
     *        <p>
     *        Constraints for EC2-Classic: ASCII characters
     *        </p>
     *        <p>
     *        Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * 
     * @param groupName
     *        The name of the security group.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     *        </p>
     *        <p>
     *        Constraints for EC2-Classic: ASCII characters
     *        </p>
     *        <p>
     *        Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$
     **/

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * 
     * @return The name of the security group.</p>
     *         <p>
     *         Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     *         </p>
     *         <p>
     *         Constraints for EC2-Classic: ASCII characters
     *         </p>
     *         <p>
     *         Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$
     **/

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * <p>
     * Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     * </p>
     * <p>
     * Constraints for EC2-Classic: ASCII characters
     * </p>
     * <p>
     * Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * </p>
     * 
     * @param groupName
     *        The name of the security group.</p>
     *        <p>
     *        Constraints: Up to 255 characters in length. Cannot start with <code>sg-</code>.
     *        </p>
     *        <p>
     *        Constraints for EC2-Classic: ASCII characters
     *        </p>
     *        <p>
     *        Constraints for EC2-VPC: a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     * 
     * @param vpcId
     *        [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * </p>
     * 
     * @param vpcId
     *        [EC2-VPC] The ID of the VPC. Required for EC2-VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSecurityGroupRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateSecurityGroupRequest> getDryRunRequest() {
        Request<CreateSecurityGroupRequest> request = new CreateSecurityGroupRequestMarshaller().marshall(this);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityGroupRequest == false)
            return false;
        CreateSecurityGroupRequest other = (CreateSecurityGroupRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSecurityGroupRequest clone() {
        return (CreateSecurityGroupRequest) super.clone();
    }
}
