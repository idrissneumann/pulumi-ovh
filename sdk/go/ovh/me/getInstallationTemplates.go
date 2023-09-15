// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package me

import (
	"github.com/ovh/pulumi-ovh/sdk/go/ovh/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the list of custom installation templates available for dedicated servers.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/ovh/pulumi-ovh/sdk/go/ovh/Me"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Me.GetInstallationTemplates(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetInstallationTemplates(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetInstallationTemplatesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstallationTemplatesResult
	err := ctx.Invoke("ovh:Me/getInstallationTemplates:getInstallationTemplates", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getInstallationTemplates.
type GetInstallationTemplatesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The list of custom installation templates IDs available for dedicated servers.
	Results []string `pulumi:"results"`
}
