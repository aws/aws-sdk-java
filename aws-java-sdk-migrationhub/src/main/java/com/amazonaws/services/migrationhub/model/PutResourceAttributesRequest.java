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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/PutResourceAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourceAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     */
    private String progressUpdateStream;
    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     */
    private String migrationTaskName;
    /**
     * <p>
     * Information about the resource that is being migrated. This data will be used to map the task to a resource in
     * the Application Discovery Service (ADS)'s repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for the
     * following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     * <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching the migration task to a server in
     * Application Discovery Service (ADS)'s repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in
     * separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize the chances of
     * matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     */
    private java.util.List<ResourceAttribute> resourceAttributeList;
    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     */

    public void setProgressUpdateStream(String progressUpdateStream) {
        this.progressUpdateStream = progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @return The name of the ProgressUpdateStream.
     */

    public String getProgressUpdateStream() {
        return this.progressUpdateStream;
    }

    /**
     * <p>
     * The name of the ProgressUpdateStream.
     * </p>
     * 
     * @param progressUpdateStream
     *        The name of the ProgressUpdateStream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceAttributesRequest withProgressUpdateStream(String progressUpdateStream) {
        setProgressUpdateStream(progressUpdateStream);
        return this;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task.
     */

    public void setMigrationTaskName(String migrationTaskName) {
        this.migrationTaskName = migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @return Unique identifier that references the migration task.
     */

    public String getMigrationTaskName() {
        return this.migrationTaskName;
    }

    /**
     * <p>
     * Unique identifier that references the migration task.
     * </p>
     * 
     * @param migrationTaskName
     *        Unique identifier that references the migration task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceAttributesRequest withMigrationTaskName(String migrationTaskName) {
        setMigrationTaskName(migrationTaskName);
        return this;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be used to map the task to a resource in
     * the Application Discovery Service (ADS)'s repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for the
     * following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     * <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching the migration task to a server in
     * Application Discovery Service (ADS)'s repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in
     * separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize the chances of
     * matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @return Information about the resource that is being migrated. This data will be used to map the task to a
     *         resource in the Application Discovery Service (ADS)'s repository.</p> <note>
     *         <p>
     *         Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved
     *         for the following values:
     *         <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *         where the identifying value can be a string up to 256 characters.
     *         </p>
     *         </note> <important>
     *         <ul>
     *         <li>
     *         <p>
     *         If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     *         <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then
     *         all "VM" fields will be discarded and "VM" fields will not be used for matching the migration task to a
     *         server in Application Discovery Service (ADS)'s repository. See the <a href=
     *         "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *         >Example</a> section below for a use case of specifying "VM" related values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you
     *         know in separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize
     *         the chances of matching.
     *         </p>
     *         </li>
     *         </ul>
     */

    public java.util.List<ResourceAttribute> getResourceAttributeList() {
        return resourceAttributeList;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be used to map the task to a resource in
     * the Application Discovery Service (ADS)'s repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for the
     * following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     * <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching the migration task to a server in
     * Application Discovery Service (ADS)'s repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in
     * separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize the chances of
     * matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param resourceAttributeList
     *        Information about the resource that is being migrated. This data will be used to map the task to a
     *        resource in the Application Discovery Service (ADS)'s repository.</p> <note>
     *        <p>
     *        Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for
     *        the following values:
     *        <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *        where the identifying value can be a string up to 256 characters.
     *        </p>
     *        </note> <important>
     *        <ul>
     *        <li>
     *        <p>
     *        If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     *        <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then
     *        all "VM" fields will be discarded and "VM" fields will not be used for matching the migration task to a
     *        server in Application Discovery Service (ADS)'s repository. See the <a href=
     *        "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *        >Example</a> section below for a use case of specifying "VM" related values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you
     *        know in separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize
     *        the chances of matching.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setResourceAttributeList(java.util.Collection<ResourceAttribute> resourceAttributeList) {
        if (resourceAttributeList == null) {
            this.resourceAttributeList = null;
            return;
        }

        this.resourceAttributeList = new java.util.ArrayList<ResourceAttribute>(resourceAttributeList);
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be used to map the task to a resource in
     * the Application Discovery Service (ADS)'s repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for the
     * following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     * <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching the migration task to a server in
     * Application Discovery Service (ADS)'s repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in
     * separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize the chances of
     * matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceAttributeList(java.util.Collection)} or
     * {@link #withResourceAttributeList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceAttributeList
     *        Information about the resource that is being migrated. This data will be used to map the task to a
     *        resource in the Application Discovery Service (ADS)'s repository.</p> <note>
     *        <p>
     *        Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for
     *        the following values:
     *        <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *        where the identifying value can be a string up to 256 characters.
     *        </p>
     *        </note> <important>
     *        <ul>
     *        <li>
     *        <p>
     *        If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     *        <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then
     *        all "VM" fields will be discarded and "VM" fields will not be used for matching the migration task to a
     *        server in Application Discovery Service (ADS)'s repository. See the <a href=
     *        "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *        >Example</a> section below for a use case of specifying "VM" related values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you
     *        know in separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize
     *        the chances of matching.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceAttributesRequest withResourceAttributeList(ResourceAttribute... resourceAttributeList) {
        if (this.resourceAttributeList == null) {
            setResourceAttributeList(new java.util.ArrayList<ResourceAttribute>(resourceAttributeList.length));
        }
        for (ResourceAttribute ele : resourceAttributeList) {
            this.resourceAttributeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource that is being migrated. This data will be used to map the task to a resource in
     * the Application Discovery Service (ADS)'s repository.
     * </p>
     * <note>
     * <p>
     * Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for the
     * following values:
     * <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     * where the identifying value can be a string up to 256 characters.
     * </p>
     * </note> <important>
     * <ul>
     * <li>
     * <p>
     * If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     * <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then all "VM"
     * fields will be discarded and "VM" fields will not be used for matching the migration task to a server in
     * Application Discovery Service (ADS)'s repository. See the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     * >Example</a> section below for a use case of specifying "VM" related values.
     * </p>
     * </li>
     * <li>
     * <p>
     * If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you know in
     * separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize the chances of
     * matching.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param resourceAttributeList
     *        Information about the resource that is being migrated. This data will be used to map the task to a
     *        resource in the Application Discovery Service (ADS)'s repository.</p> <note>
     *        <p>
     *        Takes the object array of <code>ResourceAttribute</code> where the <code>Type</code> field is reserved for
     *        the following values:
     *        <code>IPV4_ADDRESS | IPV6_ADDRESS | MAC_ADDRESS | FQDN | VM_MANAGER_ID | VM_MANAGED_OBJECT_REFERENCE | VM_NAME | VM_PATH | BIOS_ID | MOTHERBOARD_SERIAL_NUMBER</code>
     *        where the identifying value can be a string up to 256 characters.
     *        </p>
     *        </note> <important>
     *        <ul>
     *        <li>
     *        <p>
     *        If any "VM" related value is set for a <code>ResourceAttribute</code> object, it is required that
     *        <code>VM_MANAGER_ID</code>, as a minimum, is always set. If <code>VM_MANAGER_ID</code> is not set, then
     *        all "VM" fields will be discarded and "VM" fields will not be used for matching the migration task to a
     *        server in Application Discovery Service (ADS)'s repository. See the <a href=
     *        "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#API_PutResourceAttributes_Examples"
     *        >Example</a> section below for a use case of specifying "VM" related values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If a server you are trying to match has multiple IP or MAC addresses, you should provide as many as you
     *        know in separate type/value pairs passed to the <code>ResourceAttributeList</code> parameter to maximize
     *        the chances of matching.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceAttributesRequest withResourceAttributeList(java.util.Collection<ResourceAttribute> resourceAttributeList) {
        setResourceAttributeList(resourceAttributeList);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @param dryRun
     *        Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *        permission to make the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceAttributesRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission
     * to make the call.
     * </p>
     * 
     * @return Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has
     *         permission to make the call.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getProgressUpdateStream() != null)
            sb.append("ProgressUpdateStream: ").append(getProgressUpdateStream()).append(",");
        if (getMigrationTaskName() != null)
            sb.append("MigrationTaskName: ").append(getMigrationTaskName()).append(",");
        if (getResourceAttributeList() != null)
            sb.append("ResourceAttributeList: ").append(getResourceAttributeList()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourceAttributesRequest == false)
            return false;
        PutResourceAttributesRequest other = (PutResourceAttributesRequest) obj;
        if (other.getProgressUpdateStream() == null ^ this.getProgressUpdateStream() == null)
            return false;
        if (other.getProgressUpdateStream() != null && other.getProgressUpdateStream().equals(this.getProgressUpdateStream()) == false)
            return false;
        if (other.getMigrationTaskName() == null ^ this.getMigrationTaskName() == null)
            return false;
        if (other.getMigrationTaskName() != null && other.getMigrationTaskName().equals(this.getMigrationTaskName()) == false)
            return false;
        if (other.getResourceAttributeList() == null ^ this.getResourceAttributeList() == null)
            return false;
        if (other.getResourceAttributeList() != null && other.getResourceAttributeList().equals(this.getResourceAttributeList()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgressUpdateStream() == null) ? 0 : getProgressUpdateStream().hashCode());
        hashCode = prime * hashCode + ((getMigrationTaskName() == null) ? 0 : getMigrationTaskName().hashCode());
        hashCode = prime * hashCode + ((getResourceAttributeList() == null) ? 0 : getResourceAttributeList().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public PutResourceAttributesRequest clone() {
        return (PutResourceAttributesRequest) super.clone();
    }

}
