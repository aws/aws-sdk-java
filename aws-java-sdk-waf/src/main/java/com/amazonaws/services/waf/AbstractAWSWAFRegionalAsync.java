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
package com.amazonaws.services.waf;

import javax.annotation.Generated;

import com.amazonaws.services.waf.model.*;

/**
 * Abstract implementation of {@code AWSWAFRegionalAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSWAFRegionalAsync extends AbstractAWSWAFRegional implements AWSWAFRegionalAsync {

    protected AbstractAWSWAFRegionalAsync() {
    }

    @Override
    public java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest request) {

        return associateWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest request,
            com.amazonaws.handlers.AsyncHandler<AssociateWebACLRequest, AssociateWebACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest request) {

        return createByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateByteMatchSetRequest, CreateByteMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(CreateGeoMatchSetRequest request) {

        return createGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(CreateGeoMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGeoMatchSetRequest, CreateGeoMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest request) {

        return createIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(CreateRateBasedRuleRequest request) {

        return createRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(CreateRateBasedRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRateBasedRuleRequest, CreateRateBasedRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(CreateRegexMatchSetRequest request) {

        return createRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(CreateRegexMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRegexMatchSetRequest, CreateRegexMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest request) {

        return createRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRegexPatternSetRequest, CreateRegexPatternSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request) {

        return createRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest request) {

        return createRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(CreateSizeConstraintSetRequest request) {

        return createSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(CreateSizeConstraintSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSizeConstraintSetRequest, CreateSizeConstraintSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(CreateSqlInjectionMatchSetRequest request) {

        return createSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(CreateSqlInjectionMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSqlInjectionMatchSetRequest, CreateSqlInjectionMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest request) {

        return createWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateWebACLRequest, CreateWebACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(CreateXssMatchSetRequest request) {

        return createXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(CreateXssMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateXssMatchSetRequest, CreateXssMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(DeleteByteMatchSetRequest request) {

        return deleteByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(DeleteByteMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteByteMatchSetRequest, DeleteByteMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(DeleteGeoMatchSetRequest request) {

        return deleteGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(DeleteGeoMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGeoMatchSetRequest, DeleteGeoMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest request) {

        return deleteIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request) {

        return deleteLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest request) {

        return deletePermissionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionPolicyRequest, DeletePermissionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(DeleteRateBasedRuleRequest request) {

        return deleteRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(DeleteRateBasedRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRateBasedRuleRequest, DeleteRateBasedRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(DeleteRegexMatchSetRequest request) {

        return deleteRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(DeleteRegexMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRegexMatchSetRequest, DeleteRegexMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest request) {

        return deleteRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRegexPatternSetRequest, DeleteRegexPatternSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest request) {

        return deleteRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(DeleteSizeConstraintSetRequest request) {

        return deleteSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(DeleteSizeConstraintSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSizeConstraintSetRequest, DeleteSizeConstraintSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(DeleteSqlInjectionMatchSetRequest request) {

        return deleteSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(DeleteSqlInjectionMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSqlInjectionMatchSetRequest, DeleteSqlInjectionMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest request) {

        return deleteWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteWebACLRequest, DeleteWebACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(DeleteXssMatchSetRequest request) {

        return deleteXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(DeleteXssMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteXssMatchSetRequest, DeleteXssMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(DisassociateWebACLRequest request) {

        return disassociateWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(DisassociateWebACLRequest request,
            com.amazonaws.handlers.AsyncHandler<DisassociateWebACLRequest, DisassociateWebACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(GetByteMatchSetRequest request) {

        return getByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(GetByteMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetByteMatchSetRequest, GetByteMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(GetChangeTokenRequest request) {

        return getChangeTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(GetChangeTokenRequest request,
            com.amazonaws.handlers.AsyncHandler<GetChangeTokenRequest, GetChangeTokenResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(GetChangeTokenStatusRequest request) {

        return getChangeTokenStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(GetChangeTokenStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetChangeTokenStatusRequest, GetChangeTokenStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(GetGeoMatchSetRequest request) {

        return getGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(GetGeoMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGeoMatchSetRequest, GetGeoMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest request) {

        return getIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest request) {

        return getLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest request) {

        return getPermissionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPermissionPolicyRequest, GetPermissionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(GetRateBasedRuleRequest request) {

        return getRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(GetRateBasedRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleRequest, GetRateBasedRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(GetRateBasedRuleManagedKeysRequest request) {

        return getRateBasedRuleManagedKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(GetRateBasedRuleManagedKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleManagedKeysRequest, GetRateBasedRuleManagedKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(GetRegexMatchSetRequest request) {

        return getRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(GetRegexMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRegexMatchSetRequest, GetRegexMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest request) {

        return getRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRegexPatternSetRequest, GetRegexPatternSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest request) {

        return getRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRuleRequest, GetRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest request) {

        return getRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRuleGroupRequest, GetRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest request) {

        return getSampledRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSampledRequestsRequest, GetSampledRequestsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(GetSizeConstraintSetRequest request) {

        return getSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(GetSizeConstraintSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSizeConstraintSetRequest, GetSizeConstraintSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(GetSqlInjectionMatchSetRequest request) {

        return getSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(GetSqlInjectionMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSqlInjectionMatchSetRequest, GetSqlInjectionMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest request) {

        return getWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWebACLRequest, GetWebACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(GetWebACLForResourceRequest request) {

        return getWebACLForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(GetWebACLForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetWebACLForResourceRequest, GetWebACLForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(GetXssMatchSetRequest request) {

        return getXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(GetXssMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<GetXssMatchSetRequest, GetXssMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(ListActivatedRulesInRuleGroupRequest request) {

        return listActivatedRulesInRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(ListActivatedRulesInRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ListActivatedRulesInRuleGroupRequest, ListActivatedRulesInRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(ListByteMatchSetsRequest request) {

        return listByteMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(ListByteMatchSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListByteMatchSetsRequest, ListByteMatchSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(ListGeoMatchSetsRequest request) {

        return listGeoMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(ListGeoMatchSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGeoMatchSetsRequest, ListGeoMatchSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest request) {

        return listIPSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(ListLoggingConfigurationsRequest request) {

        return listLoggingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(ListLoggingConfigurationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(ListRateBasedRulesRequest request) {

        return listRateBasedRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(ListRateBasedRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRateBasedRulesRequest, ListRateBasedRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(ListRegexMatchSetsRequest request) {

        return listRegexMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(ListRegexMatchSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRegexMatchSetsRequest, ListRegexMatchSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest request) {

        return listRegexPatternSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRegexPatternSetsRequest, ListRegexPatternSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(ListResourcesForWebACLRequest request) {

        return listResourcesForWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(ListResourcesForWebACLRequest request,
            com.amazonaws.handlers.AsyncHandler<ListResourcesForWebACLRequest, ListResourcesForWebACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest request) {

        return listRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(ListSizeConstraintSetsRequest request) {

        return listSizeConstraintSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(ListSizeConstraintSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSizeConstraintSetsRequest, ListSizeConstraintSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(ListSqlInjectionMatchSetsRequest request) {

        return listSqlInjectionMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(ListSqlInjectionMatchSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSqlInjectionMatchSetsRequest, ListSqlInjectionMatchSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(ListSubscribedRuleGroupsRequest request) {

        return listSubscribedRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(ListSubscribedRuleGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSubscribedRuleGroupsRequest, ListSubscribedRuleGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest request) {

        return listWebACLsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListWebACLsRequest, ListWebACLsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(ListXssMatchSetsRequest request) {

        return listXssMatchSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(ListXssMatchSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListXssMatchSetsRequest, ListXssMatchSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest request) {

        return putLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLoggingConfigurationRequest, PutLoggingConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest request) {

        return putPermissionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPermissionPolicyRequest, PutPermissionPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(UpdateByteMatchSetRequest request) {

        return updateByteMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(UpdateByteMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateByteMatchSetRequest, UpdateByteMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(UpdateGeoMatchSetRequest request) {

        return updateGeoMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(UpdateGeoMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGeoMatchSetRequest, UpdateGeoMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest request) {

        return updateIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(UpdateRateBasedRuleRequest request) {

        return updateRateBasedRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(UpdateRateBasedRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRateBasedRuleRequest, UpdateRateBasedRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(UpdateRegexMatchSetRequest request) {

        return updateRegexMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(UpdateRegexMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRegexMatchSetRequest, UpdateRegexMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest request) {

        return updateRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRegexPatternSetRequest, UpdateRegexPatternSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest request) {

        return updateRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest request) {

        return updateRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(UpdateSizeConstraintSetRequest request) {

        return updateSizeConstraintSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(UpdateSizeConstraintSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSizeConstraintSetRequest, UpdateSizeConstraintSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(UpdateSqlInjectionMatchSetRequest request) {

        return updateSqlInjectionMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(UpdateSqlInjectionMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSqlInjectionMatchSetRequest, UpdateSqlInjectionMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest request) {

        return updateWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateWebACLRequest, UpdateWebACLResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(UpdateXssMatchSetRequest request) {

        return updateXssMatchSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(UpdateXssMatchSetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateXssMatchSetRequest, UpdateXssMatchSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
