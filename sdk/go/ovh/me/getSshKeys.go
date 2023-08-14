// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package me

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve list of names of the account's SSH keys.
//
// ## Example Usage
func GetSshKeys(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetSshKeysResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetSshKeysResult
	err := ctx.Invoke("ovh:Me/getSshKeys:getSshKeys", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getSshKeys.
type GetSshKeysResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of the names of all the SSH keys.
	Names []string `pulumi:"names"`
}