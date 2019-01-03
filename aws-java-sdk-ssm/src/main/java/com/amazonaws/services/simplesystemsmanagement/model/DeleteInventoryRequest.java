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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteInventory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInventoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom inventory type for which you want to delete either all previously collected data, or the
     * inventory type itself.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose this
     * option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of
     * the following options:
     * </p>
     * <p>
     * DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and
     * any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action for a
     * version greater than the disbled version.
     * </p>
     * <p>
     * DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the
     * schema later, if you want.
     * </p>
     */
    private String schemaDeleteOption;
    /**
     * <p>
     * Use this option to view a summary of the deletion request without deleting any data or the data type. This option
     * is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is
     * what you intend to delete, you can run the same command without specifying the <code>DryRun</code> option.
     * </p>
     */
    private Boolean dryRun;
    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the custom inventory type for which you want to delete either all previously collected data, or the
     * inventory type itself.
     * </p>
     * 
     * @param typeName
     *        The name of the custom inventory type for which you want to delete either all previously collected data,
     *        or the inventory type itself.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the custom inventory type for which you want to delete either all previously collected data, or the
     * inventory type itself.
     * </p>
     * 
     * @return The name of the custom inventory type for which you want to delete either all previously collected data,
     *         or the inventory type itself.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the custom inventory type for which you want to delete either all previously collected data, or the
     * inventory type itself.
     * </p>
     * 
     * @param typeName
     *        The name of the custom inventory type for which you want to delete either all previously collected data,
     *        or the inventory type itself.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInventoryRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose this
     * option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of
     * the following options:
     * </p>
     * <p>
     * DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and
     * any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action for a
     * version greater than the disbled version.
     * </p>
     * <p>
     * DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the
     * schema later, if you want.
     * </p>
     * 
     * @param schemaDeleteOption
     *        Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose
     *        this option, the system only deletes existing inventory data associated with the custom inventory type.
     *        Choose one of the following options:</p>
     *        <p>
     *        DisableSchema: If you choose this option, the system ignores all inventory data for the specified version,
     *        and any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action
     *        for a version greater than the disbled version.
     *        </p>
     *        <p>
     *        DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate
     *        the schema later, if you want.
     * @see InventorySchemaDeleteOption
     */

    public void setSchemaDeleteOption(String schemaDeleteOption) {
        this.schemaDeleteOption = schemaDeleteOption;
    }

    /**
     * <p>
     * Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose this
     * option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of
     * the following options:
     * </p>
     * <p>
     * DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and
     * any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action for a
     * version greater than the disbled version.
     * </p>
     * <p>
     * DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the
     * schema later, if you want.
     * </p>
     * 
     * @return Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose
     *         this option, the system only deletes existing inventory data associated with the custom inventory type.
     *         Choose one of the following options:</p>
     *         <p>
     *         DisableSchema: If you choose this option, the system ignores all inventory data for the specified
     *         version, and any earlier versions. To enable this schema again, you must call the
     *         <code>PutInventory</code> action for a version greater than the disbled version.
     *         </p>
     *         <p>
     *         DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate
     *         the schema later, if you want.
     * @see InventorySchemaDeleteOption
     */

    public String getSchemaDeleteOption() {
        return this.schemaDeleteOption;
    }

    /**
     * <p>
     * Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose this
     * option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of
     * the following options:
     * </p>
     * <p>
     * DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and
     * any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action for a
     * version greater than the disbled version.
     * </p>
     * <p>
     * DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the
     * schema later, if you want.
     * </p>
     * 
     * @param schemaDeleteOption
     *        Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose
     *        this option, the system only deletes existing inventory data associated with the custom inventory type.
     *        Choose one of the following options:</p>
     *        <p>
     *        DisableSchema: If you choose this option, the system ignores all inventory data for the specified version,
     *        and any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action
     *        for a version greater than the disbled version.
     *        </p>
     *        <p>
     *        DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate
     *        the schema later, if you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventorySchemaDeleteOption
     */

    public DeleteInventoryRequest withSchemaDeleteOption(String schemaDeleteOption) {
        setSchemaDeleteOption(schemaDeleteOption);
        return this;
    }

    /**
     * <p>
     * Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose this
     * option, the system only deletes existing inventory data associated with the custom inventory type. Choose one of
     * the following options:
     * </p>
     * <p>
     * DisableSchema: If you choose this option, the system ignores all inventory data for the specified version, and
     * any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action for a
     * version greater than the disbled version.
     * </p>
     * <p>
     * DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate the
     * schema later, if you want.
     * </p>
     * 
     * @param schemaDeleteOption
     *        Use the <code>SchemaDeleteOption</code> to delete a custom inventory type (schema). If you don't choose
     *        this option, the system only deletes existing inventory data associated with the custom inventory type.
     *        Choose one of the following options:</p>
     *        <p>
     *        DisableSchema: If you choose this option, the system ignores all inventory data for the specified version,
     *        and any earlier versions. To enable this schema again, you must call the <code>PutInventory</code> action
     *        for a version greater than the disbled version.
     *        </p>
     *        <p>
     *        DeleteSchema: This option deletes the specified custom type from the Inventory service. You can recreate
     *        the schema later, if you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InventorySchemaDeleteOption
     */

    public DeleteInventoryRequest withSchemaDeleteOption(InventorySchemaDeleteOption schemaDeleteOption) {
        this.schemaDeleteOption = schemaDeleteOption.toString();
        return this;
    }

    /**
     * <p>
     * Use this option to view a summary of the deletion request without deleting any data or the data type. This option
     * is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is
     * what you intend to delete, you can run the same command without specifying the <code>DryRun</code> option.
     * </p>
     * 
     * @param dryRun
     *        Use this option to view a summary of the deletion request without deleting any data or the data type. This
     *        option is useful when you only want to understand what will be deleted. Once you validate that the data to
     *        be deleted is what you intend to delete, you can run the same command without specifying the
     *        <code>DryRun</code> option.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Use this option to view a summary of the deletion request without deleting any data or the data type. This option
     * is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is
     * what you intend to delete, you can run the same command without specifying the <code>DryRun</code> option.
     * </p>
     * 
     * @return Use this option to view a summary of the deletion request without deleting any data or the data type.
     *         This option is useful when you only want to understand what will be deleted. Once you validate that the
     *         data to be deleted is what you intend to delete, you can run the same command without specifying the
     *         <code>DryRun</code> option.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Use this option to view a summary of the deletion request without deleting any data or the data type. This option
     * is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is
     * what you intend to delete, you can run the same command without specifying the <code>DryRun</code> option.
     * </p>
     * 
     * @param dryRun
     *        Use this option to view a summary of the deletion request without deleting any data or the data type. This
     *        option is useful when you only want to understand what will be deleted. Once you validate that the data to
     *        be deleted is what you intend to delete, you can run the same command without specifying the
     *        <code>DryRun</code> option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInventoryRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Use this option to view a summary of the deletion request without deleting any data or the data type. This option
     * is useful when you only want to understand what will be deleted. Once you validate that the data to be deleted is
     * what you intend to delete, you can run the same command without specifying the <code>DryRun</code> option.
     * </p>
     * 
     * @return Use this option to view a summary of the deletion request without deleting any data or the data type.
     *         This option is useful when you only want to understand what will be deleted. Once you validate that the
     *         data to be deleted is what you intend to delete, you can run the same command without specifying the
     *         <code>DryRun</code> option.
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @return User-provided idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * 
     * @param clientToken
     *        User-provided idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInventoryRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getSchemaDeleteOption() != null)
            sb.append("SchemaDeleteOption: ").append(getSchemaDeleteOption()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInventoryRequest == false)
            return false;
        DeleteInventoryRequest other = (DeleteInventoryRequest) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getSchemaDeleteOption() == null ^ this.getSchemaDeleteOption() == null)
            return false;
        if (other.getSchemaDeleteOption() != null && other.getSchemaDeleteOption().equals(this.getSchemaDeleteOption()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getSchemaDeleteOption() == null) ? 0 : getSchemaDeleteOption().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInventoryRequest clone() {
        return (DeleteInventoryRequest) super.clone();
    }

}
