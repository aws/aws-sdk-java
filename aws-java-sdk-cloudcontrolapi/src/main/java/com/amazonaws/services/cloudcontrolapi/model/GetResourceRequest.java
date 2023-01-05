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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource type.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     */
    private String typeVersionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * <p>
     * You can specify the primary identifier, or any secondary identifier defined for the resource type in its resource
     * schema. You can only specify one identifier. Primary identifiers can be specified as a string or JSON; secondary
     * identifiers must be specified as JSON.
     * </p>
     * <p>
     * For compound primary identifiers (that is, one that consists of multiple resource properties strung together), to
     * specify the primary identifier as a string, list the property values <i>in the order they are specified</i> in
     * the primary identifier definition, separated by <code>|</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     */
    private String identifier;

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @return The name of the resource type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     * 
     * @param typeVersionId
     *        For private resource types, the type version to use in this resource operation. If you do not specify a
     *        resource version, CloudFormation uses the default version.
     */

    public void setTypeVersionId(String typeVersionId) {
        this.typeVersionId = typeVersionId;
    }

    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     * 
     * @return For private resource types, the type version to use in this resource operation. If you do not specify a
     *         resource version, CloudFormation uses the default version.
     */

    public String getTypeVersionId() {
        return this.typeVersionId;
    }

    /**
     * <p>
     * For private resource types, the type version to use in this resource operation. If you do not specify a resource
     * version, CloudFormation uses the default version.
     * </p>
     * 
     * @param typeVersionId
     *        For private resource types, the type version to use in this resource operation. If you do not specify a
     *        resource version, CloudFormation uses the default version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequest withTypeVersionId(String typeVersionId) {
        setTypeVersionId(typeVersionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to
     *        use when performing this resource operation. The role specified must have the permissions required for
     *        this operation. The necessary permissions for each event handler are defined in the
     *        <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     *        section of the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource
     *        type definition schema</a>.</p>
     *        <p>
     *        If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web
     *        Services user credentials.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     *        >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to
     *         use when performing this resource operation. The role specified must have the permissions required for
     *         this operation. The necessary permissions for each event handler are defined in the
     *         <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     *         section of the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource
     *         type definition schema</a>.</p>
     *         <p>
     *         If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web
     *         Services user credentials.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     *         >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to use when
     * performing this resource operation. The role specified must have the permissions required for this operation. The
     * necessary permissions for each event handler are defined in the
     * <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     * section of the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource type
     * definition schema</a>.
     * </p>
     * <p>
     * If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web Services
     * user credentials.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     * >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role for Cloud Control API to
     *        use when performing this resource operation. The role specified must have the permissions required for
     *        this operation. The necessary permissions for each event handler are defined in the
     *        <code> <a href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html#schema-properties-handlers">handlers</a> </code>
     *        section of the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-schema.html">resource
     *        type definition schema</a>.</p>
     *        <p>
     *        If you do not specify a role, Cloud Control API uses a temporary session created using your Amazon Web
     *        Services user credentials.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations.html#resource-operations-permissions"
     *        >Specifying credentials</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * <p>
     * You can specify the primary identifier, or any secondary identifier defined for the resource type in its resource
     * schema. You can only specify one identifier. Primary identifiers can be specified as a string or JSON; secondary
     * identifiers must be specified as JSON.
     * </p>
     * <p>
     * For compound primary identifiers (that is, one that consists of multiple resource properties strung together), to
     * specify the primary identifier as a string, list the property values <i>in the order they are specified</i> in
     * the primary identifier definition, separated by <code>|</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param identifier
     *        The identifier for the resource.</p>
     *        <p>
     *        You can specify the primary identifier, or any secondary identifier defined for the resource type in its
     *        resource schema. You can only specify one identifier. Primary identifiers can be specified as a string or
     *        JSON; secondary identifiers must be specified as JSON.
     *        </p>
     *        <p>
     *        For compound primary identifiers (that is, one that consists of multiple resource properties strung
     *        together), to specify the primary identifier as a string, list the property values <i>in the order they
     *        are specified</i> in the primary identifier definition, separated by <code>|</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     *        resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * <p>
     * You can specify the primary identifier, or any secondary identifier defined for the resource type in its resource
     * schema. You can only specify one identifier. Primary identifiers can be specified as a string or JSON; secondary
     * identifiers must be specified as JSON.
     * </p>
     * <p>
     * For compound primary identifiers (that is, one that consists of multiple resource properties strung together), to
     * specify the primary identifier as a string, list the property values <i>in the order they are specified</i> in
     * the primary identifier definition, separated by <code>|</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @return The identifier for the resource.</p>
     *         <p>
     *         You can specify the primary identifier, or any secondary identifier defined for the resource type in its
     *         resource schema. You can only specify one identifier. Primary identifiers can be specified as a string or
     *         JSON; secondary identifiers must be specified as JSON.
     *         </p>
     *         <p>
     *         For compound primary identifiers (that is, one that consists of multiple resource properties strung
     *         together), to specify the primary identifier as a string, list the property values <i>in the order they
     *         are specified</i> in the primary identifier definition, separated by <code>|</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     *         resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The identifier for the resource.
     * </p>
     * <p>
     * You can specify the primary identifier, or any secondary identifier defined for the resource type in its resource
     * schema. You can only specify one identifier. Primary identifiers can be specified as a string or JSON; secondary
     * identifiers must be specified as JSON.
     * </p>
     * <p>
     * For compound primary identifiers (that is, one that consists of multiple resource properties strung together), to
     * specify the primary identifier as a string, list the property values <i>in the order they are specified</i> in
     * the primary identifier definition, separated by <code>|</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * 
     * @param identifier
     *        The identifier for the resource.</p>
     *        <p>
     *        You can specify the primary identifier, or any secondary identifier defined for the resource type in its
     *        resource schema. You can only specify one identifier. Primary identifiers can be specified as a string or
     *        JSON; secondary identifiers must be specified as JSON.
     *        </p>
     *        <p>
     *        For compound primary identifiers (that is, one that consists of multiple resource properties strung
     *        together), to specify the primary identifier as a string, list the property values <i>in the order they
     *        are specified</i> in the primary identifier definition, separated by <code>|</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-identifier.html">Identifying
     *        resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getTypeVersionId() != null)
            sb.append("TypeVersionId: ").append(getTypeVersionId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceRequest == false)
            return false;
        GetResourceRequest other = (GetResourceRequest) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getTypeVersionId() == null ^ this.getTypeVersionId() == null)
            return false;
        if (other.getTypeVersionId() != null && other.getTypeVersionId().equals(this.getTypeVersionId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeVersionId() == null) ? 0 : getTypeVersionId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceRequest clone() {
        return (GetResourceRequest) super.clone();
    }

}
