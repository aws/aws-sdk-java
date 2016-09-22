/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSSimpleSystemsManagement}. Convenient method forms pass through to the
 * corresponding overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSSimpleSystemsManagement implements AWSSimpleSystemsManagement {

    protected AbstractAWSSimpleSystemsManagement() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CancelCommandResult cancelCommand(CancelCommandRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateActivationResult createActivation(CreateActivationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAssociationResult createAssociation(CreateAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAssociationBatchResult createAssociationBatch(CreateAssociationBatchRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDocumentResult createDocument(CreateDocumentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteActivationResult deleteActivation(DeleteActivationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteAssociationResult deleteAssociation(DeleteAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteDocumentResult deleteDocument(DeleteDocumentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterManagedInstanceResult deregisterManagedInstance(DeregisterManagedInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeActivationsResult describeActivations(DescribeActivationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAssociationResult describeAssociation(DescribeAssociationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDocumentResult describeDocument(DescribeDocumentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDocumentPermissionResult describeDocumentPermission(DescribeDocumentPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeInstanceInformationResult describeInstanceInformation(DescribeInstanceInformationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDocumentResult getDocument(GetDocumentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssociationsResult listAssociations(ListAssociationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCommandInvocationsResult listCommandInvocations(ListCommandInvocationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCommandsResult listCommands(ListCommandsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDocumentsResult listDocuments(ListDocumentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDocumentsResult listDocuments() {
        return listDocuments(new ListDocumentsRequest());
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyDocumentPermissionResult modifyDocumentPermission(ModifyDocumentPermissionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(RemoveTagsFromResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SendCommandResult sendCommand(SendCommandRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAssociationStatusResult updateAssociationStatus(UpdateAssociationStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateManagedInstanceRoleResult updateManagedInstanceRole(UpdateManagedInstanceRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
