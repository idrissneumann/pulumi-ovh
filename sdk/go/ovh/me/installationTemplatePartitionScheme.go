// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package me

import (
	"context"
	"reflect"

	"errors"
	"github.com/ovh/pulumi-ovh/sdk/go/ovh/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create partition scheme for a custom installation template available for dedicated servers.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			mytemplate, err := Me.NewInstallationTemplate(ctx, "mytemplate", &Me.InstallationTemplateArgs{
//				BaseTemplateName: pulumi.String("debian12_64"),
//				TemplateName:     pulumi.String("mytemplate"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Me.NewInstallationTemplatePartitionScheme(ctx, "scheme", &Me.InstallationTemplatePartitionSchemeArgs{
//				TemplateName: mytemplate.TemplateName,
//				Priority:     pulumi.Int(1),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// The resource can be imported using the `template_name`, `name` of the cluster, separated by "/" E.g.,
//
// bash
//
// ```sh
// $ pulumi import ovh:Me/installationTemplatePartitionScheme:InstallationTemplatePartitionScheme scheme template_name/name
// ```
type InstallationTemplatePartitionScheme struct {
	pulumi.CustomResourceState

	// (Required) This partition scheme name.
	Name pulumi.StringOutput `pulumi:"name"`
	// on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
	Priority pulumi.IntOutput `pulumi:"priority"`
	// The template name of the partition scheme.
	TemplateName pulumi.StringOutput `pulumi:"templateName"`
}

// NewInstallationTemplatePartitionScheme registers a new resource with the given unique name, arguments, and options.
func NewInstallationTemplatePartitionScheme(ctx *pulumi.Context,
	name string, args *InstallationTemplatePartitionSchemeArgs, opts ...pulumi.ResourceOption) (*InstallationTemplatePartitionScheme, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	if args.TemplateName == nil {
		return nil, errors.New("invalid value for required argument 'TemplateName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstallationTemplatePartitionScheme
	err := ctx.RegisterResource("ovh:Me/installationTemplatePartitionScheme:InstallationTemplatePartitionScheme", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstallationTemplatePartitionScheme gets an existing InstallationTemplatePartitionScheme resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstallationTemplatePartitionScheme(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstallationTemplatePartitionSchemeState, opts ...pulumi.ResourceOption) (*InstallationTemplatePartitionScheme, error) {
	var resource InstallationTemplatePartitionScheme
	err := ctx.ReadResource("ovh:Me/installationTemplatePartitionScheme:InstallationTemplatePartitionScheme", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstallationTemplatePartitionScheme resources.
type installationTemplatePartitionSchemeState struct {
	// (Required) This partition scheme name.
	Name *string `pulumi:"name"`
	// on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
	Priority *int `pulumi:"priority"`
	// The template name of the partition scheme.
	TemplateName *string `pulumi:"templateName"`
}

type InstallationTemplatePartitionSchemeState struct {
	// (Required) This partition scheme name.
	Name pulumi.StringPtrInput
	// on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
	Priority pulumi.IntPtrInput
	// The template name of the partition scheme.
	TemplateName pulumi.StringPtrInput
}

func (InstallationTemplatePartitionSchemeState) ElementType() reflect.Type {
	return reflect.TypeOf((*installationTemplatePartitionSchemeState)(nil)).Elem()
}

type installationTemplatePartitionSchemeArgs struct {
	// (Required) This partition scheme name.
	Name *string `pulumi:"name"`
	// on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
	Priority int `pulumi:"priority"`
	// The template name of the partition scheme.
	TemplateName string `pulumi:"templateName"`
}

// The set of arguments for constructing a InstallationTemplatePartitionScheme resource.
type InstallationTemplatePartitionSchemeArgs struct {
	// (Required) This partition scheme name.
	Name pulumi.StringPtrInput
	// on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
	Priority pulumi.IntInput
	// The template name of the partition scheme.
	TemplateName pulumi.StringInput
}

func (InstallationTemplatePartitionSchemeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*installationTemplatePartitionSchemeArgs)(nil)).Elem()
}

type InstallationTemplatePartitionSchemeInput interface {
	pulumi.Input

	ToInstallationTemplatePartitionSchemeOutput() InstallationTemplatePartitionSchemeOutput
	ToInstallationTemplatePartitionSchemeOutputWithContext(ctx context.Context) InstallationTemplatePartitionSchemeOutput
}

func (*InstallationTemplatePartitionScheme) ElementType() reflect.Type {
	return reflect.TypeOf((**InstallationTemplatePartitionScheme)(nil)).Elem()
}

func (i *InstallationTemplatePartitionScheme) ToInstallationTemplatePartitionSchemeOutput() InstallationTemplatePartitionSchemeOutput {
	return i.ToInstallationTemplatePartitionSchemeOutputWithContext(context.Background())
}

func (i *InstallationTemplatePartitionScheme) ToInstallationTemplatePartitionSchemeOutputWithContext(ctx context.Context) InstallationTemplatePartitionSchemeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstallationTemplatePartitionSchemeOutput)
}

// InstallationTemplatePartitionSchemeArrayInput is an input type that accepts InstallationTemplatePartitionSchemeArray and InstallationTemplatePartitionSchemeArrayOutput values.
// You can construct a concrete instance of `InstallationTemplatePartitionSchemeArrayInput` via:
//
//	InstallationTemplatePartitionSchemeArray{ InstallationTemplatePartitionSchemeArgs{...} }
type InstallationTemplatePartitionSchemeArrayInput interface {
	pulumi.Input

	ToInstallationTemplatePartitionSchemeArrayOutput() InstallationTemplatePartitionSchemeArrayOutput
	ToInstallationTemplatePartitionSchemeArrayOutputWithContext(context.Context) InstallationTemplatePartitionSchemeArrayOutput
}

type InstallationTemplatePartitionSchemeArray []InstallationTemplatePartitionSchemeInput

func (InstallationTemplatePartitionSchemeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstallationTemplatePartitionScheme)(nil)).Elem()
}

func (i InstallationTemplatePartitionSchemeArray) ToInstallationTemplatePartitionSchemeArrayOutput() InstallationTemplatePartitionSchemeArrayOutput {
	return i.ToInstallationTemplatePartitionSchemeArrayOutputWithContext(context.Background())
}

func (i InstallationTemplatePartitionSchemeArray) ToInstallationTemplatePartitionSchemeArrayOutputWithContext(ctx context.Context) InstallationTemplatePartitionSchemeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstallationTemplatePartitionSchemeArrayOutput)
}

// InstallationTemplatePartitionSchemeMapInput is an input type that accepts InstallationTemplatePartitionSchemeMap and InstallationTemplatePartitionSchemeMapOutput values.
// You can construct a concrete instance of `InstallationTemplatePartitionSchemeMapInput` via:
//
//	InstallationTemplatePartitionSchemeMap{ "key": InstallationTemplatePartitionSchemeArgs{...} }
type InstallationTemplatePartitionSchemeMapInput interface {
	pulumi.Input

	ToInstallationTemplatePartitionSchemeMapOutput() InstallationTemplatePartitionSchemeMapOutput
	ToInstallationTemplatePartitionSchemeMapOutputWithContext(context.Context) InstallationTemplatePartitionSchemeMapOutput
}

type InstallationTemplatePartitionSchemeMap map[string]InstallationTemplatePartitionSchemeInput

func (InstallationTemplatePartitionSchemeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstallationTemplatePartitionScheme)(nil)).Elem()
}

func (i InstallationTemplatePartitionSchemeMap) ToInstallationTemplatePartitionSchemeMapOutput() InstallationTemplatePartitionSchemeMapOutput {
	return i.ToInstallationTemplatePartitionSchemeMapOutputWithContext(context.Background())
}

func (i InstallationTemplatePartitionSchemeMap) ToInstallationTemplatePartitionSchemeMapOutputWithContext(ctx context.Context) InstallationTemplatePartitionSchemeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstallationTemplatePartitionSchemeMapOutput)
}

type InstallationTemplatePartitionSchemeOutput struct{ *pulumi.OutputState }

func (InstallationTemplatePartitionSchemeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstallationTemplatePartitionScheme)(nil)).Elem()
}

func (o InstallationTemplatePartitionSchemeOutput) ToInstallationTemplatePartitionSchemeOutput() InstallationTemplatePartitionSchemeOutput {
	return o
}

func (o InstallationTemplatePartitionSchemeOutput) ToInstallationTemplatePartitionSchemeOutputWithContext(ctx context.Context) InstallationTemplatePartitionSchemeOutput {
	return o
}

// (Required) This partition scheme name.
func (o InstallationTemplatePartitionSchemeOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstallationTemplatePartitionScheme) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications).
func (o InstallationTemplatePartitionSchemeOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *InstallationTemplatePartitionScheme) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// The template name of the partition scheme.
func (o InstallationTemplatePartitionSchemeOutput) TemplateName() pulumi.StringOutput {
	return o.ApplyT(func(v *InstallationTemplatePartitionScheme) pulumi.StringOutput { return v.TemplateName }).(pulumi.StringOutput)
}

type InstallationTemplatePartitionSchemeArrayOutput struct{ *pulumi.OutputState }

func (InstallationTemplatePartitionSchemeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstallationTemplatePartitionScheme)(nil)).Elem()
}

func (o InstallationTemplatePartitionSchemeArrayOutput) ToInstallationTemplatePartitionSchemeArrayOutput() InstallationTemplatePartitionSchemeArrayOutput {
	return o
}

func (o InstallationTemplatePartitionSchemeArrayOutput) ToInstallationTemplatePartitionSchemeArrayOutputWithContext(ctx context.Context) InstallationTemplatePartitionSchemeArrayOutput {
	return o
}

func (o InstallationTemplatePartitionSchemeArrayOutput) Index(i pulumi.IntInput) InstallationTemplatePartitionSchemeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstallationTemplatePartitionScheme {
		return vs[0].([]*InstallationTemplatePartitionScheme)[vs[1].(int)]
	}).(InstallationTemplatePartitionSchemeOutput)
}

type InstallationTemplatePartitionSchemeMapOutput struct{ *pulumi.OutputState }

func (InstallationTemplatePartitionSchemeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstallationTemplatePartitionScheme)(nil)).Elem()
}

func (o InstallationTemplatePartitionSchemeMapOutput) ToInstallationTemplatePartitionSchemeMapOutput() InstallationTemplatePartitionSchemeMapOutput {
	return o
}

func (o InstallationTemplatePartitionSchemeMapOutput) ToInstallationTemplatePartitionSchemeMapOutputWithContext(ctx context.Context) InstallationTemplatePartitionSchemeMapOutput {
	return o
}

func (o InstallationTemplatePartitionSchemeMapOutput) MapIndex(k pulumi.StringInput) InstallationTemplatePartitionSchemeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstallationTemplatePartitionScheme {
		return vs[0].(map[string]*InstallationTemplatePartitionScheme)[vs[1].(string)]
	}).(InstallationTemplatePartitionSchemeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstallationTemplatePartitionSchemeInput)(nil)).Elem(), &InstallationTemplatePartitionScheme{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstallationTemplatePartitionSchemeArrayInput)(nil)).Elem(), InstallationTemplatePartitionSchemeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstallationTemplatePartitionSchemeMapInput)(nil)).Elem(), InstallationTemplatePartitionSchemeMap{})
	pulumi.RegisterOutputType(InstallationTemplatePartitionSchemeOutput{})
	pulumi.RegisterOutputType(InstallationTemplatePartitionSchemeArrayOutput{})
	pulumi.RegisterOutputType(InstallationTemplatePartitionSchemeMapOutput{})
}
