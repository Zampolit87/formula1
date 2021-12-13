<!DOCTYPE html>
<html class="" lang="uk">
<head prefix="og: http://ogp.me/ns#">
<meta charset="utf-8">
<link rel="preload" href="/assets/application_utilities-fa3148ad24e616bfa530484a9393969c21280799fb9f29f932670d419defeb21.css" as="style" type="text/css">
<link rel="preload" href="/assets/application-a8bf3d1210afa873d9b9af583e944bdbf5ac7c8a63f6eccc3d6795802bd380d2.css" as="style" type="text/css">
<link rel="preload" href="/assets/highlight/themes/dark-1a9b28eab513ffcbab04b54685ffd4b2548e5dd2dd7d4848a96e16ba84a42cbf.css" as="style" type="text/css">

<meta content="IE=edge" http-equiv="X-UA-Compatible">
<script>
//<![CDATA[
var gl = window.gl || {};
gl.startup_calls = {"/Kelevra/formula1/-/blob/master/README.md?format=json\u0026viewer=simple":{},"/Kelevra/formula1/-/blob/master/README.md?format=json\u0026viewer=rich":{}};
gl.startup_graphql_calls = null;

if (gl.startup_calls && window.fetch) {
  Object.keys(gl.startup_calls).forEach(apiCall => {
    // fetch won’t send cookies in older browsers, unless you set the credentials init option.
    // We set to `same-origin` which is default value in modern browsers.
    // See https://github.com/whatwg/fetch/pull/585 for more information.
    gl.startup_calls[apiCall] = {
      fetchCall: fetch(apiCall, { credentials: 'same-origin' })
    };
  });
}
if (gl.startup_graphql_calls && window.fetch) {
  const url = `https://git.foxminded.com.ua/api/graphql`

  const opts = {
    method: "POST",
    headers: { "Content-Type": "application/json", 'X-CSRF-Token': "5JPniwgfjDIDx4aHspJshDNnnH00PiUbMt1tclbiZIN8Ar7cpbH5tUmtZcY9DJg4Iba5QBI68ddSfx3SCx8r7A==" },
  };

  gl.startup_graphql_calls = gl.startup_graphql_calls.map(call => ({
    ...call,
    fetchCall: fetch(url, {
      ...opts,
      credentials: 'same-origin',
      body: JSON.stringify(call)
    })
  }))
}


//]]>
</script>
<meta content="object" property="og:type">
<meta content="GitLab" property="og:site_name">
<meta content="README.md · master · В&#39;ячеслав / formula1" property="og:title">
<meta content="True online learning company!" property="og:description">
<meta content="https://git.foxminded.com.ua/assets/gitlab_logo-7ae504fe4f68fdebb3c2034e36621930cd36ea87924c11ff65dbcb8ed50dca58.png" property="og:image">
<meta content="64" property="og:image:width">
<meta content="64" property="og:image:height">
<meta content="https://git.foxminded.com.ua/Kelevra/formula1/-/blob/master/README.md" property="og:url">
<meta content="summary" property="twitter:card">
<meta content="README.md · master · В&#39;ячеслав / formula1" property="twitter:title">
<meta content="True online learning company!" property="twitter:description">
<meta content="https://git.foxminded.com.ua/assets/gitlab_logo-7ae504fe4f68fdebb3c2034e36621930cd36ea87924c11ff65dbcb8ed50dca58.png" property="twitter:image">

<title>README.md · master · В&#39;ячеслав / formula1 · GitLab</title>
<meta content="True online learning company!" name="description">
<link rel="prefetch" href="/assets/webpack/monaco.8b639003.chunk.js">
<link rel="shortcut icon" type="image/png" href="/assets/favicon-7901bd695fb93edb07975966062049829afb56cf11511236e61bcf425070e36e.png" id="favicon" data-original-href="/assets/favicon-7901bd695fb93edb07975966062049829afb56cf11511236e61bcf425070e36e.png" />
<style>
@keyframes blinking-dot{0%{opacity:1}25%{opacity:0.4}75%{opacity:0.4}100%{opacity:1}}@keyframes blinking-scroll-button{0%{opacity:0.2}50%{opacity:1}100%{opacity:0.2}}@keyframes gl-spinner-rotate{0%{transform:rotate(0)}100%{transform:rotate(360deg)}}body.ui-indigo .navbar-gitlab{background-color:#292961}body.ui-indigo .navbar-gitlab .navbar-collapse{color:#d1d1f0}body.ui-indigo .navbar-gitlab .container-fluid .navbar-toggler{border-left:1px solid #6868b9;color:#d1d1f0}body.ui-indigo .navbar-gitlab .navbar-sub-nav>li>a:hover,body.ui-indigo .navbar-gitlab .navbar-sub-nav>li>a:focus,body.ui-indigo .navbar-gitlab .navbar-sub-nav>li>button:hover,body.ui-indigo .navbar-gitlab .navbar-sub-nav>li>button:focus,body.ui-indigo .navbar-gitlab .navbar-nav>li>a:hover,body.ui-indigo .navbar-gitlab .navbar-nav>li>a:focus,body.ui-indigo .navbar-gitlab .navbar-nav>li>button:hover,body.ui-indigo .navbar-gitlab .navbar-nav>li>button:focus{background-color:rgba(209,209,240,0.2)}body.ui-indigo .navbar-gitlab .navbar-sub-nav>li.active>a,body.ui-indigo .navbar-gitlab .navbar-sub-nav>li.active>button,body.ui-indigo .navbar-gitlab .navbar-sub-nav>li.dropdown.show>a,body.ui-indigo .navbar-gitlab .navbar-sub-nav>li.dropdown.show>button,body.ui-indigo .navbar-gitlab .navbar-nav>li.active>a,body.ui-indigo .navbar-gitlab .navbar-nav>li.active>button,body.ui-indigo .navbar-gitlab .navbar-nav>li.dropdown.show>a,body.ui-indigo .navbar-gitlab .navbar-nav>li.dropdown.show>button{color:#292961;background-color:#fff}body.ui-indigo .navbar-gitlab .navbar-sub-nav>li.line-separator,body.ui-indigo .navbar-gitlab .navbar-nav>li.line-separator{border-left:1px solid rgba(209,209,240,0.2)}body.ui-indigo .navbar-gitlab .navbar-sub-nav{color:#d1d1f0}body.ui-indigo .navbar-gitlab .nav>li{color:#d1d1f0}body.ui-indigo .navbar-gitlab .nav>li>a .notification-dot{border:2px solid #292961}body.ui-indigo .navbar-gitlab .nav>li>a.header-help-dropdown-toggle .notification-dot{background-color:#d1d1f0}body.ui-indigo .navbar-gitlab .nav>li>a.header-user-dropdown-toggle .header-user-avatar{border-color:#d1d1f0}@media (min-width: 576px){body.ui-indigo .navbar-gitlab .nav>li>a:hover,body.ui-indigo .navbar-gitlab .nav>li>a:focus{background-color:rgba(209,209,240,0.2)}}body.ui-indigo .navbar-gitlab .nav>li>a:hover svg,body.ui-indigo .navbar-gitlab .nav>li>a:focus svg{fill:currentColor}body.ui-indigo .navbar-gitlab .nav>li>a:hover .notification-dot,body.ui-indigo .navbar-gitlab .nav>li>a:focus .notification-dot{will-change:border-color, background-color;border-color:#4a4a82}body.ui-indigo .navbar-gitlab .nav>li>a:hover.header-help-dropdown-toggle .notification-dot,body.ui-indigo .navbar-gitlab .nav>li>a:focus.header-help-dropdown-toggle .notification-dot{background-color:#fff}body.ui-indigo .navbar-gitlab .nav>li.active>a,body.ui-indigo .navbar-gitlab .nav>li.dropdown.show>a{color:#292961;background-color:#fff}body.ui-indigo .navbar-gitlab .nav>li.active>a:hover svg,body.ui-indigo .navbar-gitlab .nav>li.dropdown.show>a:hover svg{fill:#292961}body.ui-indigo .navbar-gitlab .nav>li.active>a .notification-dot,body.ui-indigo .navbar-gitlab .nav>li.dropdown.show>a .notification-dot{border-color:#fff}body.ui-indigo .navbar-gitlab .nav>li.active>a.header-help-dropdown-toggle .notification-dot,body.ui-indigo .navbar-gitlab .nav>li.dropdown.show>a.header-help-dropdown-toggle .notification-dot{background-color:#292961}body.ui-indigo .navbar-gitlab .nav>li .impersonated-user svg,body.ui-indigo .navbar-gitlab .nav>li .impersonated-user:hover svg{fill:#292961}body.ui-indigo .navbar .title>a:hover,body.ui-indigo .navbar .title>a:focus{background-color:rgba(209,209,240,0.2)}body.ui-indigo .header-search{background-color:rgba(209,209,240,0.2) !important}body.ui-indigo .header-search:hover{background-color:rgba(209,209,240,0.3) !important}body.ui-indigo .header-search svg{color:rgba(209,209,240,0.8) !important}body.ui-indigo .header-search input{background-color:transparent;color:rgba(209,209,240,0.8)}body.ui-indigo .header-search input::placeholder{color:rgba(209,209,240,0.8)}body.ui-indigo .header-search input:focus::placeholder,body.ui-indigo .header-search input:active::placeholder{color:#d1d1f0}body.ui-indigo .search form{background-color:rgba(209,209,240,0.2)}body.ui-indigo .search form:hover{background-color:rgba(209,209,240,0.3)}body.ui-indigo .search .search-input::placeholder{color:rgba(209,209,240,0.8)}body.ui-indigo .search .search-input-wrap .search-icon,body.ui-indigo .search .search-input-wrap .clear-icon{fill:rgba(209,209,240,0.8)}body.ui-indigo .search.search-active form{background-color:#fff}body.ui-indigo .search.search-active .search-input-wrap .search-icon{fill:rgba(209,209,240,0.8)}body.ui-indigo .nav-sidebar li.active>a{color:#2f2a6b}body.ui-indigo .nav-sidebar .fly-out-top-item a,body.ui-indigo .nav-sidebar .fly-out-top-item a:hover,body.ui-indigo .nav-sidebar .fly-out-top-item.active a,body.ui-indigo .nav-sidebar .fly-out-top-item .fly-out-top-item-container{background-color:var(--purple-100, #2f2a6b);color:var(--black, #fff)}body.ui-indigo .nav-links li.active a,body.ui-indigo .nav-links li.md-header-tab.active button,body.ui-indigo .nav-links li a.active{border-bottom:2px solid #6666c4}body.ui-indigo .nav-links li.active a .badge.badge-pill,body.ui-indigo .nav-links li.md-header-tab.active button .badge.badge-pill,body.ui-indigo .nav-links li a.active .badge.badge-pill{font-weight:600}body.ui-indigo .emoji-picker-category-active{border-bottom-color:#6666c4}body.ui-indigo .branch-header-title{color:#4b4ba3}body.ui-indigo .ide-sidebar-link.active{color:#4b4ba3}body.ui-indigo .ide-sidebar-link.active.is-right{box-shadow:inset -3px 0 #4b4ba3}

*,*::before,*::after{box-sizing:border-box}html{font-family:sans-serif;line-height:1.15}aside,header{display:block}body{margin:0;font-family:-apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Noto Sans", Ubuntu, Cantarell, "Helvetica Neue", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";font-size:1rem;font-weight:400;line-height:1.5;color:#303030;text-align:left;background-color:#fff}h1{margin-top:0;margin-bottom:0.25rem}ul{margin-top:0;margin-bottom:1rem}ul ul{margin-bottom:0}strong{font-weight:bolder}a{color:#007bff;text-decoration:none;background-color:transparent}a:not([href]):not([class]){color:inherit;text-decoration:none}img{vertical-align:middle;border-style:none}svg{overflow:hidden;vertical-align:middle}button{border-radius:0}input,button{margin:0;font-family:inherit;font-size:inherit;line-height:inherit}button,input{overflow:visible}button{text-transform:none}[role="button"]{cursor:pointer}button:not(:disabled),[type="button"]:not(:disabled){cursor:pointer}button::-moz-focus-inner,[type="button"]::-moz-focus-inner{padding:0;border-style:none}[type="search"]{outline-offset:-2px}h1{margin-bottom:0.25rem;font-weight:600;line-height:1.2;color:#303030}h1{font-size:2.1875rem}.list-unstyled{padding-left:0;list-style:none}.container-fluid{width:100%;padding-right:15px;padding-left:15px;margin-right:auto;margin-left:auto}.form-control{display:block;width:100%;height:34px;padding:0.375rem 0.75rem;font-size:0.875rem;font-weight:400;line-height:1.5;color:#303030;background-color:#fff;background-clip:padding-box;border:1px solid #dbdbdb;border-radius:0.25rem}.form-control:-moz-focusring{color:transparent;text-shadow:0 0 0 #303030}.form-control::placeholder{color:#5e5e5e;opacity:1}.form-control:disabled{background-color:#fafafa;opacity:1}.form-inline{display:flex;flex-flow:row wrap;align-items:center}@media (min-width: 576px){.form-inline .form-control{display:inline-block;width:auto;vertical-align:middle}}.btn{display:inline-block;font-weight:400;color:#303030;text-align:center;vertical-align:middle;-webkit-user-select:none;user-select:none;background-color:transparent;border:1px solid transparent;padding:0.375rem 0.75rem;font-size:1rem;line-height:20px;border-radius:0.25rem}.btn:disabled{opacity:0.65}.btn:not(:disabled):not(.disabled){cursor:pointer}.collapse:not(.show){display:none}.dropdown{position:relative}.dropdown-menu-toggle{white-space:nowrap}.dropdown-menu-toggle::after{display:inline-block;margin-left:0.255em;vertical-align:0.255em;content:"";border-top:0.3em solid;border-right:0.3em solid transparent;border-bottom:0;border-left:0.3em solid transparent}.dropdown-menu-toggle:empty::after{margin-left:0}.dropdown-menu{position:absolute;top:100%;left:0;z-index:1000;display:none;float:left;min-width:10rem;padding:0.5rem 0;margin:0.125rem 0 0;font-size:1rem;color:#303030;text-align:left;list-style:none;background-color:#fff;background-clip:padding-box;border:1px solid rgba(0,0,0,0.15);border-radius:0.25rem}.nav{display:flex;flex-wrap:wrap;padding-left:0;margin-bottom:0;list-style:none}.navbar{position:relative;display:flex;flex-wrap:wrap;align-items:center;justify-content:space-between;padding:0.25rem 0.5rem}.navbar .container-fluid{display:flex;flex-wrap:wrap;align-items:center;justify-content:space-between}.navbar-nav{display:flex;flex-direction:column;padding-left:0;margin-bottom:0;list-style:none}.navbar-nav .dropdown-menu{position:static;float:none}.navbar-collapse{flex-basis:100%;flex-grow:1;align-items:center}.navbar-toggler{padding:0.25rem 0.75rem;font-size:1.25rem;line-height:1;background-color:transparent;border:1px solid transparent;border-radius:0.25rem}@media (max-width: 575.98px){.navbar-expand-sm>.container-fluid{padding-right:0;padding-left:0}}@media (min-width: 576px){.navbar-expand-sm{flex-flow:row nowrap;justify-content:flex-start}.navbar-expand-sm .navbar-nav{flex-direction:row}.navbar-expand-sm .navbar-nav .dropdown-menu{position:absolute}.navbar-expand-sm>.container-fluid{flex-wrap:nowrap}.navbar-expand-sm .navbar-collapse{display:flex !important;flex-basis:auto}.navbar-expand-sm .navbar-toggler{display:none}}.badge{display:inline-block;padding:0.25em 0.4em;font-size:75%;font-weight:600;line-height:1;text-align:center;white-space:nowrap;vertical-align:baseline;border-radius:0.25rem}.badge:empty{display:none}.btn .badge{position:relative;top:-1px}.badge-pill{padding-right:0.6em;padding-left:0.6em;border-radius:10rem}.rounded-circle{border-radius:50% !important}.d-none{display:none !important}.d-block{display:block !important}@media (min-width: 576px){.d-sm-none{display:none !important}.d-sm-inline-block{display:inline-block !important}}@media (min-width: 768px){.d-md-block{display:block !important}}@media (min-width: 992px){.d-lg-none{display:none !important}.d-lg-block{display:block !important}}.sr-only{position:absolute;width:1px;height:1px;padding:0;margin:-1px;overflow:hidden;clip:rect(0, 0, 0, 0);white-space:nowrap;border:0}.m-auto{margin:auto !important}.gl-form-input,.gl-form-input.form-control{background-color:#fff;font-family:-apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Noto Sans", Ubuntu, Cantarell, "Helvetica Neue", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";font-size:0.875rem;line-height:1rem;padding-top:0.5rem;padding-bottom:0.5rem;padding-left:0.75rem;padding-right:0.75rem;height:auto;color:#303030;box-shadow:inset 0 0 0 1px #868686;border-style:none;-webkit-appearance:none;appearance:none;-moz-appearance:none}.gl-form-input:disabled,.gl-form-input:not(.form-control-plaintext):not([type="color"]):read-only,.gl-form-input.form-control:disabled,.gl-form-input.form-control:not(.form-control-plaintext):not([type="color"]):read-only{background-color:#fafafa;color:#868686;box-shadow:inset 0 0 0 1px #dbdbdb;cursor:not-allowed}.gl-form-input::placeholder,.gl-form-input.form-control::placeholder{color:#868686}.gl-button{display:inline-flex}.gl-button:not(.btn-link):active{text-decoration:none}.gl-button.gl-button{border-width:0;padding-top:0.5rem;padding-bottom:0.5rem;padding-left:0.75rem;padding-right:0.75rem;background-color:transparent;line-height:1rem;color:#303030;fill:currentColor;box-shadow:inset 0 0 0 1px #bfbfbf;justify-content:center;align-items:center;font-size:0.875rem;border-radius:0.25rem}.gl-button.gl-button.btn-default{background-color:#fff}.gl-button.gl-button.btn-default:active,.gl-button.gl-button.btn-default.active{box-shadow:inset 0 0 0 2px #5e5e5e,0 0 0 1px rgba(255,255,255,0.4),0 0 0 4px rgba(31,117,203,0.48);outline:none;background-color:#dbdbdb}body,.form-control,.search form{font-size:0.875rem}button,html [type="button"],[role="button"]{cursor:pointer}h1{margin-top:20px;margin-bottom:10px}strong{font-weight:bold}a{color:#1068bf}.hidden{display:none !important;visibility:hidden !important}.hide{display:none}.dropdown-menu-toggle::after{display:none}.badge:not(.gl-badge){padding:4px 5px;font-size:12px;font-style:normal;font-weight:400;display:inline-block}.divider{height:0;margin:4px 0;overflow:hidden;border-top:1px solid #dbdbdb}.toggle-sidebar-button .collapse-text,.toggle-sidebar-button .icon-chevron-double-lg-left{color:#666}svg{vertical-align:baseline}html{overflow-y:scroll}body{text-decoration-skip:ink}.btn{border-radius:4px;font-size:0.875rem;font-weight:400;padding:6px 10px;background-color:#fff;border-color:#dbdbdb;color:#303030;color:#303030;white-space:nowrap}.btn:active{background-color:#f0f0f0;box-shadow:none}.btn:active,.btn.active{background-color:#eaeaea;border-color:#e3e3e3;color:#303030}.btn svg{height:15px;width:15px}.btn svg:not(:last-child){margin-right:5px}.badge.badge-pill:not(.gl-badge){font-weight:400;background-color:rgba(0,0,0,0.07);color:#525252;vertical-align:baseline}.gl-font-sm{font-size:12px}.dropdown{position:relative}.search-input-container .dropdown-menu{margin-top:11px}.dropdown-menu-toggle{padding:6px 8px 6px 10px;background-color:#fff;color:#303030;font-size:14px;text-align:left;border:1px solid #dbdbdb;border-radius:0.25rem;white-space:nowrap}.no-outline.dropdown-menu-toggle{outline:0}.dropdown-menu-toggle.dropdown-menu-toggle{justify-content:flex-start;overflow:hidden;padding-right:25px;position:relative;text-overflow:ellipsis;width:160px}.dropdown-menu{display:none;position:absolute;width:auto;top:100%;z-index:300;min-width:240px;max-width:500px;margin-top:4px;margin-bottom:24px;font-size:0.875rem;font-weight:400;padding:8px 0;background-color:#fff;border:1px solid #dbdbdb;border-radius:0.25rem;box-shadow:0 2px 4px rgba(0,0,0,0.1)}.dropdown-menu ul{margin:0;padding:0}.dropdown-menu li{display:block;text-align:left;list-style:none;padding:0 1px}.dropdown-menu li>a,.dropdown-menu li button{background:transparent;border:0;border-radius:0;box-shadow:none;display:block;font-weight:400;position:relative;padding:8px 12px;color:#303030;line-height:16px;white-space:normal;overflow:hidden;text-align:left;width:100%}.dropdown-menu li>a:active,.dropdown-menu li button:active{background-color:#eee;color:#303030;outline:0;text-decoration:none}.dropdown-menu .divider{height:1px;margin:0.25rem 0;padding:0;background-color:#dbdbdb}.dropdown-menu .badge.badge-pill+span:not(.badge):not(.badge-pill){margin-right:40px}@media (max-width: 575.98px){.navbar-gitlab li.dropdown{position:static}.navbar-gitlab li.dropdown.user-counter{margin-left:8px !important}.navbar-gitlab li.dropdown.user-counter>a{padding:0 4px !important}header.navbar-gitlab .dropdown .dropdown-menu{width:100%;min-width:100%}}@media (max-width: 767.98px){.dropdown-menu-toggle{width:100%}}input{border-radius:0.25rem;color:#303030;background-color:#fff}.form-control{border-radius:4px;padding:6px 10px}.form-control::placeholder{color:#868686}.navbar-gitlab{padding:0 16px;z-index:1000;margin-bottom:0;min-height:40px;border:0;position:fixed;top:0;left:0;right:0;border-radius:0}.navbar-gitlab .logo-text{line-height:initial}.navbar-gitlab .logo-text svg{width:55px;height:14px;margin:0;fill:#fff}.navbar-gitlab .close-icon{display:none}.navbar-gitlab .header-content{width:100%;display:flex;justify-content:space-between;position:relative;min-height:40px;padding-left:0}.navbar-gitlab .header-content .title-container{display:flex;align-items:stretch;flex:1 1 auto;padding-top:0;overflow:visible}.navbar-gitlab .header-content .title{padding-right:0;color:currentColor;display:flex;position:relative;margin:0;font-size:18px;vertical-align:top;white-space:nowrap}.navbar-gitlab .header-content .title img{height:28px}.navbar-gitlab .header-content .title img+.logo-text{margin-left:8px}.navbar-gitlab .header-content .title a{display:flex;align-items:center;padding:2px 8px;margin:5px 2px 5px -8px;border-radius:4px}.navbar-gitlab .header-content .navbar-collapse>ul.nav>li:not(.d-none){margin:0 2px}.navbar-gitlab .navbar-collapse{flex:0 0 auto;border-top:0;padding:0}@media (max-width: 575.98px){.navbar-gitlab .navbar-collapse{flex:1 1 auto}}.navbar-gitlab .navbar-collapse .nav{flex-wrap:nowrap}@media (max-width: 575.98px){.navbar-gitlab .navbar-collapse .nav>li:not(.d-none) a{margin-left:0}}.navbar-gitlab .container-fluid{padding:0}.navbar-gitlab .container-fluid .user-counter svg{margin-right:3px}.navbar-gitlab .container-fluid .navbar-toggler{position:relative;right:-10px;border-radius:0;min-width:45px;padding:0;margin:8px -7px 8px 0;font-size:14px;text-align:center;color:currentColor}.navbar-gitlab .container-fluid .navbar-toggler.active{color:currentColor;background-color:transparent}@media (max-width: 575.98px){.navbar-gitlab .container-fluid .navbar-nav{display:flex;padding-right:10px;flex-direction:row}}.navbar-gitlab .container-fluid .navbar-nav li .badge.badge-pill:not(.merge-request-badge){box-shadow:none;font-weight:600}@media (max-width: 575.98px){.navbar-gitlab .container-fluid .nav>li.header-user{padding-left:10px}}.navbar-gitlab .container-fluid .nav>li>a{will-change:color;margin:4px 0;padding:6px 8px;height:32px}@media (max-width: 575.98px){.navbar-gitlab .container-fluid .nav>li>a{padding:0}}.navbar-gitlab .container-fluid .nav>li>a.header-user-dropdown-toggle{margin-left:2px}.navbar-gitlab .container-fluid .nav>li>a.header-user-dropdown-toggle .header-user-avatar{margin-right:0}.navbar-gitlab .container-fluid .nav>li .header-new-dropdown-toggle{margin-right:0}.navbar-sub-nav>li>a,.navbar-sub-nav>li>button,.navbar-nav>li>a,.navbar-nav>li>button{display:flex;align-items:center;justify-content:center;padding:6px 8px;margin:4px 2px;font-size:12px;color:currentColor;border-radius:4px;height:32px;font-weight:600}.navbar-sub-nav>li .top-nav-toggle,.navbar-sub-nav>li>button,.navbar-nav>li .top-nav-toggle,.navbar-nav>li>button{background:transparent;border:0}.navbar-sub-nav .dropdown-menu,.navbar-nav .dropdown-menu{position:absolute}.navbar-sub-nav{display:flex;margin:0 0 0 6px}.caret-down,.btn .caret-down{top:0;height:11px;width:11px;margin-left:4px;fill:currentColor}.header-user .dropdown-menu,.header-new .dropdown-menu{margin-top:4px}.btn-sign-in{background-color:#ebebfa;color:#292961;font-weight:600;line-height:18px;margin:4px 0 4px 2px}.title-container .badge.badge-pill:not(.merge-request-badge),.navbar-nav .badge.badge-pill:not(.merge-request-badge){position:inherit;font-weight:400;margin-left:-6px;font-size:11px;color:var(--gray-950, #fff);padding:0 5px;line-height:12px;border-radius:7px;box-shadow:0 1px 0 rgba(76,78,84,0.2)}.title-container .badge.badge-pill:not(.merge-request-badge).green-badge,.navbar-nav .badge.badge-pill:not(.merge-request-badge).green-badge{background-color:var(--green-400, #2da160)}.title-container .badge.badge-pill:not(.merge-request-badge).merge-requests-count,.navbar-nav .badge.badge-pill:not(.merge-request-badge).merge-requests-count{background-color:var(--orange-400, #c17d10)}.title-container .badge.badge-pill:not(.merge-request-badge).todos-count,.navbar-nav .badge.badge-pill:not(.merge-request-badge).todos-count{background-color:var(--blue-400, #428fdc)}@media (max-width: 575.98px){.navbar-gitlab .container-fluid{font-size:18px}.navbar-gitlab .container-fluid .navbar-nav{table-layout:fixed;width:100%;margin:0;text-align:right}.navbar-gitlab .container-fluid .navbar-collapse{margin-left:-8px;margin-right:-10px}.navbar-gitlab .container-fluid .navbar-collapse .nav>li:not(.d-none){flex:1}.header-user-dropdown-toggle{text-align:center}.header-user-avatar{float:none}}.header-user-avatar{float:left;margin-right:5px;border-radius:50%;border:1px solid #f5f5f5}.notification-dot{background-color:#d99530;height:12px;width:12px;margin-top:-15px;pointer-events:none;visibility:hidden}.top-nav-toggle .dropdown-icon{margin-right:0.5rem}.tanuki-logo .tanuki-left-ear,.tanuki-logo .tanuki-right-ear,.tanuki-logo .tanuki-nose{fill:#e24329}.tanuki-logo .tanuki-left-eye,.tanuki-logo .tanuki-right-eye{fill:#fc6d26}.tanuki-logo .tanuki-left-cheek,.tanuki-logo .tanuki-right-cheek{fill:#fca326}.context-header{position:relative;margin-right:2px;width:220px}.context-header>a,.context-header>button{font-weight:600;display:flex;width:100%;align-items:center;padding:10px 16px 10px 10px;color:#303030;background-color:transparent;border:0;text-align:left}.context-header .avatar-container{flex:0 0 40px;background-color:#fff}.context-header .sidebar-context-title{overflow:hidden;text-overflow:ellipsis;color:#303030}@media (min-width: 768px){.page-with-contextual-sidebar{padding-left:48px}}@media (min-width: 1200px){.page-with-contextual-sidebar{padding-left:220px}}@media (min-width: 768px){.page-with-icon-sidebar{padding-left:48px}}.nav-sidebar{position:fixed;bottom:0;left:0;z-index:600;width:220px;top:40px;background-color:#f0f0f0;transform:translate3d(0, 0, 0)}.nav-sidebar.sidebar-collapsed-desktop{width:48px}.nav-sidebar.sidebar-collapsed-desktop .nav-sidebar-inner-scroll{overflow-x:hidden}.nav-sidebar.sidebar-collapsed-desktop .badge.badge-pill:not(.fly-out-badge),.nav-sidebar.sidebar-collapsed-desktop .nav-item-name,.nav-sidebar.sidebar-collapsed-desktop .collapse-text{border:0;clip:rect(0, 0, 0, 0);height:1px;margin:-1px;overflow:hidden;padding:0;position:absolute;white-space:nowrap;width:1px}.nav-sidebar.sidebar-collapsed-desktop .sidebar-top-level-items>li>a{min-height:unset}.nav-sidebar.sidebar-collapsed-desktop .fly-out-top-item:not(.divider){display:block !important}.nav-sidebar.sidebar-collapsed-desktop .avatar-container{margin:0 auto}.nav-sidebar.sidebar-collapsed-desktop li.active:not(.fly-out-top-item)>a{background-color:rgba(41,41,97,0.08)}.nav-sidebar a{text-decoration:none;color:#303030}.nav-sidebar li{white-space:nowrap}.nav-sidebar li .nav-item-name{flex:1}.nav-sidebar li>a,.nav-sidebar li>.fly-out-top-item-container{padding-left:0.75rem;padding-right:0.75rem;padding-top:0.5rem;padding-bottom:0.5rem;display:flex;align-items:center;border-radius:0.25rem;width:auto;line-height:1rem;margin:1px 4px}.nav-sidebar li.active>a{font-weight:600}.nav-sidebar li.active:not(.fly-out-top-item)>a:not(.has-sub-items){background-color:rgba(41,41,97,0.08)}.nav-sidebar ul{padding-left:0;list-style:none}@media (max-width: 767.98px){.nav-sidebar{left:-220px}}.nav-sidebar .nav-icon-container{display:flex;margin-right:8px}.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item{display:none}.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item a,.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item.active a,.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item .fly-out-top-item-container{margin-left:0;margin-right:0;padding-left:1rem;padding-right:1rem;cursor:default;pointer-events:none;font-size:0.75rem;margin-top:-0.25rem;margin-bottom:-0.25rem;margin-top:0;position:relative;color:#fff;background:var(--black, #000)}.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item a strong,.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item.active a strong,.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item .fly-out-top-item-container strong{font-weight:400}.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item a::before,.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item.active a::before,.nav-sidebar a:not(.has-sub-items)+.sidebar-sub-level-items .fly-out-top-item .fly-out-top-item-container::before{position:absolute;content:"";display:block;top:50%;left:-0.25rem;margin-top:-0.25rem;width:0;height:0;border-top:0.25rem solid transparent;border-bottom:0.25rem solid transparent;border-right:0.25rem solid #000;border-right-color:var(--black, #000)}.nav-sidebar a.has-sub-items+.sidebar-sub-level-items .fly-out-top-item{display:none}.nav-sidebar a.has-sub-items+.sidebar-sub-level-items .fly-out-top-item a,.nav-sidebar a.has-sub-items+.sidebar-sub-level-items .fly-out-top-item.active a,.nav-sidebar a.has-sub-items+.sidebar-sub-level-items .fly-out-top-item .fly-out-top-item-container{margin-left:0;margin-right:0;padding-left:1rem;padding-right:1rem;cursor:default;pointer-events:none;font-size:0.75rem;margin-top:0;border-bottom-left-radius:0;border-bottom-right-radius:0}@media (min-width: 768px) and (max-width: 1199px){.nav-sidebar:not(.sidebar-expanded-mobile){width:48px}.nav-sidebar:not(.sidebar-expanded-mobile) .nav-sidebar-inner-scroll{overflow-x:hidden}.nav-sidebar:not(.sidebar-expanded-mobile) .badge.badge-pill:not(.fly-out-badge),.nav-sidebar:not(.sidebar-expanded-mobile) .nav-item-name,.nav-sidebar:not(.sidebar-expanded-mobile) .collapse-text{border:0;clip:rect(0, 0, 0, 0);height:1px;margin:-1px;overflow:hidden;padding:0;position:absolute;white-space:nowrap;width:1px}.nav-sidebar:not(.sidebar-expanded-mobile) .sidebar-top-level-items>li>a{min-height:unset}.nav-sidebar:not(.sidebar-expanded-mobile) .fly-out-top-item:not(.divider){display:block !important}.nav-sidebar:not(.sidebar-expanded-mobile) .avatar-container{margin:0 auto}.nav-sidebar:not(.sidebar-expanded-mobile) li.active:not(.fly-out-top-item)>a{background-color:rgba(41,41,97,0.08)}.nav-sidebar:not(.sidebar-expanded-mobile) .context-header{height:60px;width:48px}.nav-sidebar:not(.sidebar-expanded-mobile) .context-header a{padding:10px 4px}.nav-sidebar:not(.sidebar-expanded-mobile) .sidebar-context-title{border:0;clip:rect(0, 0, 0, 0);height:1px;margin:-1px;overflow:hidden;padding:0;position:absolute;white-space:nowrap;width:1px}.nav-sidebar:not(.sidebar-expanded-mobile) .context-header{height:auto}.nav-sidebar:not(.sidebar-expanded-mobile) .context-header a{padding:0.25rem}.nav-sidebar:not(.sidebar-expanded-mobile) .sidebar-top-level-items>li .sidebar-sub-level-items:not(.flyout-list){display:none}.nav-sidebar:not(.sidebar-expanded-mobile) .nav-icon-container{margin-right:0}.nav-sidebar:not(.sidebar-expanded-mobile) .toggle-sidebar-button{width:48px}.nav-sidebar:not(.sidebar-expanded-mobile) .toggle-sidebar-button .collapse-text{display:none}.nav-sidebar:not(.sidebar-expanded-mobile) .toggle-sidebar-button .icon-chevron-double-lg-left{transform:rotate(180deg);margin:0}}.nav-sidebar-inner-scroll{height:100%;width:100%;overflow:auto}.nav-sidebar-inner-scroll>div.context-header{margin-top:0.25rem}.nav-sidebar-inner-scroll>div.context-header a{padding-left:0.75rem;padding-right:0.75rem;padding-top:0.5rem;padding-bottom:0.5rem;display:flex;align-items:center;border-radius:0.25rem;width:auto;line-height:1rem;margin:1px 4px;padding:0.25rem;margin-bottom:0.25rem;margin-top:0}.nav-sidebar-inner-scroll>div.context-header a .avatar-container{font-weight:400;flex:none;box-shadow:inset 0 0 0 1px rgba(0,0,0,0.08)}.nav-sidebar-inner-scroll>div.context-header a .avatar-container.rect-avatar{border-style:none}.nav-sidebar-inner-scroll>div.context-header a .avatar-container.rect-avatar .avatar.s32{box-shadow:inset 0 0 0 1px rgba(0,0,0,0.08)}.sidebar-top-level-items{margin-top:0.25rem;margin-bottom:60px}.sidebar-top-level-items .context-header a{padding:0.25rem;margin-bottom:0.25rem;margin-top:0}.sidebar-top-level-items .context-header a .avatar-container{font-weight:400;flex:none;box-shadow:inset 0 0 0 1px rgba(0,0,0,0.08)}.sidebar-top-level-items .context-header a .avatar-container.rect-avatar{border-style:none}.sidebar-top-level-items .context-header a .avatar-container.rect-avatar .avatar.s32{box-shadow:inset 0 0 0 1px rgba(0,0,0,0.08)}.sidebar-top-level-items>li .badge.badge-pill{border-radius:0.5rem;padding-top:0.125rem;padding-bottom:0.125rem;padding-left:0.5rem;padding-right:0.5rem;background-color:#cbe2f9;color:#0b5cad}.sidebar-top-level-items>li.active .sidebar-sub-level-items:not(.is-fly-out-only){display:block}.sidebar-top-level-items>li.active .badge.badge-pill{font-weight:400;color:#0b5cad}.sidebar-sub-level-items{padding-top:0;padding-bottom:0;display:none}.sidebar-sub-level-items:not(.fly-out-list) li>a{padding-left:2.25rem}.toggle-sidebar-button,.close-nav-button{height:48px;padding:0 16px;background-color:#fafafa;border:0;color:#666;display:flex;align-items:center;background-color:#f0f0f0;border-top:1px solid #dbdbdb;position:fixed;bottom:0;width:220px}.toggle-sidebar-button .collapse-text,.toggle-sidebar-button .icon-chevron-double-lg-left,.close-nav-button .collapse-text,.close-nav-button .icon-chevron-double-lg-left{color:inherit}.collapse-text{white-space:nowrap;overflow:hidden}.sidebar-collapsed-desktop .context-header{height:60px;width:48px}.sidebar-collapsed-desktop .context-header a{padding:10px 4px}.sidebar-collapsed-desktop .sidebar-context-title{border:0;clip:rect(0, 0, 0, 0);height:1px;margin:-1px;overflow:hidden;padding:0;position:absolute;white-space:nowrap;width:1px}.sidebar-collapsed-desktop .context-header{height:auto}.sidebar-collapsed-desktop .context-header a{padding:0.25rem}.sidebar-collapsed-desktop .sidebar-top-level-items>li .sidebar-sub-level-items:not(.flyout-list){display:none}.sidebar-collapsed-desktop .nav-icon-container{margin-right:0}.sidebar-collapsed-desktop .toggle-sidebar-button{width:48px}.sidebar-collapsed-desktop .toggle-sidebar-button .collapse-text{display:none}.sidebar-collapsed-desktop .toggle-sidebar-button .icon-chevron-double-lg-left{transform:rotate(180deg);margin:0}.close-nav-button{display:none}@media (max-width: 767.98px){.close-nav-button{display:flex}.toggle-sidebar-button{display:none}}input::-moz-placeholder{color:#868686;opacity:1}input::-ms-input-placeholder{color:#868686}input:-ms-input-placeholder{color:#868686}svg{fill:currentColor}svg.s12{width:12px;height:12px}svg.s16{width:16px;height:16px}svg.s32{width:32px;height:32px}svg.s12{vertical-align:-1px}svg.s16{vertical-align:-3px}.header-search{width:320px}.search{margin:0 8px}.search form{display:block;margin:0;padding:4px;width:200px;line-height:24px;height:32px;border:0;border-radius:4px}@media (min-width: 1200px){.search form{width:320px}}.search .search-input{border:0;font-size:14px;padding:0 20px 0 0;margin-left:5px;line-height:25px;width:98%;color:#fff;background:none}.search .search-input-container{display:flex;position:relative}.search .search-input-wrap{width:100%}.search .search-input-wrap .search-icon,.search .search-input-wrap .clear-icon{position:absolute;right:5px;top:4px}.search .search-input-wrap .search-icon{-webkit-user-select:none;user-select:none}.search .search-input-wrap .clear-icon{display:none}.search .search-input-wrap .dropdown{position:static}.search .search-input-wrap .dropdown-menu{left:-5px;max-height:400px;overflow:auto}@media (min-width: 1200px){.search .search-input-wrap .dropdown-menu{width:320px}}.search .identicon{flex-basis:16px;flex-shrink:0;margin-right:4px}.avatar,.avatar-container{float:left;margin-right:16px;border-radius:50%;border:1px solid rgba(0,0,0,0.08)}.avatar.s16,.avatar-container.s16{width:16px;height:16px;margin-right:8px}.avatar.s32,.avatar-container.s32{width:32px;height:32px;margin-right:8px}.avatar{transition-property:none;width:40px;height:40px;padding:0;background:#fdfdfd;overflow:hidden;border-color:rgba(0,0,0,0.1)}.avatar.avatar-tile{border-radius:0;border:0}.identicon{text-align:center;vertical-align:top;color:#303030;background-color:#f0f0f0}.identicon.s16{font-size:10px;line-height:16px}.identicon.s32{font-size:14px;line-height:32px}.identicon.bg1{background-color:#fcf1ef}.identicon.bg2{background-color:#f4f0ff}.identicon.bg3{background-color:#f1f1ff}.identicon.bg4{background-color:#e9f3fc}.identicon.bg5{background-color:#ecf4ee}.identicon.bg6{background-color:#fdf1dd}.identicon.bg7{background-color:#f0f0f0}.avatar-container{overflow:hidden;display:flex}.avatar-container a{width:100%;height:100%;display:flex;text-decoration:none}.avatar-container .avatar{border-radius:0;border:0;height:auto;width:100%;margin:0;align-self:center}.rect-avatar{border-radius:2px}.rect-avatar.s16{border-radius:2px}.rect-avatar.s32,.nav-sidebar-inner-scroll>div.context-header a .avatar-container.rect-avatar .avatar.s32,.sidebar-top-level-items .context-header a .avatar-container.rect-avatar .avatar.s32{border-radius:4px}.tab-width-8{-moz-tab-size:8;tab-size:8}.gl-sr-only{border:0;clip:rect(0, 0, 0, 0);height:1px;margin:-1px;overflow:hidden;padding:0;position:absolute;white-space:nowrap;width:1px}.gl-border-none\!{border-style:none !important}.gl-display-none{display:none}@media (min-width: 36rem){.gl-sm-display-block{display:block}}.gl-absolute{position:absolute}.gl-px-3{padding-left:0.5rem;padding-right:0.5rem}.gl-pr-2{padding-right:0.25rem}.gl-ml-3{margin-left:0.5rem}.gl-mx-0\!{margin-left:0 !important;margin-right:0 !important}.gl-font-sm{font-size:0.75rem}.gl-font-weight-bold{font-weight:600}.content-wrapper>.alert-wrapper,#content-body,.modal-dialog{display:none}

</style>

<link rel="stylesheet" media="print" href="/assets/application-a8bf3d1210afa873d9b9af583e944bdbf5ac7c8a63f6eccc3d6795802bd380d2.css" />

<link rel="stylesheet" media="print" href="/assets/application_utilities-fa3148ad24e616bfa530484a9393969c21280799fb9f29f932670d419defeb21.css" />


<link rel="stylesheet" media="print" href="/assets/highlight/themes/dark-1a9b28eab513ffcbab04b54685ffd4b2548e5dd2dd7d4848a96e16ba84a42cbf.css" />
<script>
//<![CDATA[
document.querySelectorAll('link[media="print"]').forEach(linkTag => {
  linkTag.setAttribute('data-startupcss', 'loading');
  const startupLinkLoadedEvent = new CustomEvent('CSSStartupLinkLoaded');
  linkTag.addEventListener('load',function(){this.media='all';this.setAttribute('data-startupcss', 'loaded');document.dispatchEvent(startupLinkLoadedEvent);},{once: true});
})

//]]>
</script>

<script>
//<![CDATA[
window.gon={};gon.api_version="v4";gon.default_avatar_url="https://git.foxminded.com.ua/assets/no_avatar-849f9c04a3a0d0cea2424ae97b27447dc64a7dbfae83c036c45b403392f0e8ba.png";gon.max_file_size=10;gon.asset_host=null;gon.webpack_public_path="/assets/webpack/";gon.relative_url_root="";gon.user_color_scheme="dark";gon.markdown_surround_selection=true;gon.recaptcha_api_server_url="https://www.google.com/recaptcha/api.js";gon.recaptcha_sitekey="";gon.gitlab_url="https://git.foxminded.com.ua";gon.revision="92acfb1b8a9";gon.feature_category="source_code_management";gon.gitlab_logo="/assets/gitlab_logo-7ae504fe4f68fdebb3c2034e36621930cd36ea87924c11ff65dbcb8ed50dca58.png";gon.sprite_icons="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg";gon.sprite_file_icons="/assets/file_icons-c13caf2f3ca00cc2c02b11d373ac288c200b9b4dcddbb52a5027dc07b3eece19.svg";gon.emoji_sprites_css_path="/assets/emoji_sprites-3825d771ad697b27553bcece6c17a12969dd7407cf0fe3897aad012efc0bf827.css";gon.select2_css_path="/assets/lazy_bundles/select2-d720397d08b21964ee0c701ea40aa6286d8928eab7edfac24d05b3c63c466b81.css";gon.test_env=false;gon.disable_animations=null;gon.suggested_label_colors={"#009966":"Green-cyan","#8fbc8f":"Dark sea green","#3cb371":"Medium sea green","#00b140":"Green screen","#013220":"Dark green","#6699cc":"Blue-gray","#0000ff":"Blue","#e6e6fa":"Lavendar","#9400d3":"Dark violet","#330066":"Deep violet","#808080":"Gray","#36454f":"Charcoal grey","#f7e7ce":"Champagne","#c21e56":"Rose red","#cc338b":"Magenta-pink","#dc143c":"Crimson","#ff0000":"Red","#cd5b45":"Dark coral","#eee600":"Titanium yellow","#ed9121":"Carrot orange","#c39953":"Aztec Gold"};gon.first_day_of_week=1;gon.time_display_relative=true;gon.ee=false;gon.jh=false;gon.dot_com=false;gon.current_user_id=883;gon.current_username="Kelevra";gon.current_user_fullname="В'ячеслав";gon.current_user_avatar_url="https://secure.gravatar.com/avatar/9cfea5dc1c818d2dd414e58b7de3f457?s=80\u0026d=identicon";gon.features={"snippetsBinaryBlob":false,"usageDataApi":true,"securityAutoFix":false,"improvedEmojiPicker":true,"newHeaderSearch":false,"refactorBlobViewer":false,"consolidatedEditButton":false};
//]]>
</script>
<script src="/assets/locale/uk/app-1ab2e0abf56e6a04cf69a517bd9f677afe6f37b1d9dcbea8c8c808cc3540710d.js" defer="defer"></script>



<script src="/assets/webpack/runtime.c9270e10.bundle.js" defer="defer"></script>
<script src="/assets/webpack/main.103e9d48.chunk.js" defer="defer"></script>
<script src="/assets/webpack/graphql.27c48bb1.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-globalSearch-pages.admin.abuse_reports-pages.admin.groups.show-pages.admin.projects-pages.ad-3fae7a27.b729f526.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.groups.boards-pages.groups.details-pages.groups.show-pages.projects-pages.projects.act-9419cb45.98afb858.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.ide-pages.projects-pages.projects.activity-pages.projects.alert_management.details-pag-186e08d0.fbeea03c.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.projects-pages.projects.activity-pages.projects.alert_management.details-pages.project-49eea23f.9968e5b9.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.groups.milestones.edit-pages.groups.milestones.new-pages.projects.blame.show-pages.pro-77e8c306.476fa885.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.projects.blob.show-pages.projects.show-pages.projects.snippets.show-pages.projects.tre-c684fcf6.3f79baf5.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.projects.blob.show-pages.projects.forks.new-pages.projects.show-pages.projects.tree.show.c949ad50.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.projects.blob.show-pages.projects.show-pages.projects.tree.show.d07e2894.chunk.js" defer="defer"></script>
<script src="/assets/webpack/commons-pages.projects.blob.show-pages.projects.commits.show-pages.projects.compare.show.f94de677.chunk.js" defer="defer"></script>
<script src="/assets/webpack/pages.projects.blob.show.e120f58f.chunk.js" defer="defer"></script>
<script>
//<![CDATA[
window.uploads_path = "/Kelevra/formula1/uploads";



//]]>
</script>
<meta name="csrf-param" content="authenticity_token" />
<meta name="csrf-token" content="Rr2CMPoG6MChf/sPaelPqISpeI15q6zqs+HHuDKKIFneLNtnV6idR+sVGE7md7sUlnhdsF+veCbTQ7cYb3dvNg==" />
<meta name="csp-nonce" />
<meta name="action-cable-url" content="/-/cable" />
<meta content="width=device-width, initial-scale=1, maximum-scale=1" name="viewport">
<meta content="#292961" name="theme-color">
<link rel="apple-touch-icon" type="image/x-icon" href="/assets/touch-icon-iphone-5a9cee0e8a51212e70b90c87c12f382c428870c0ff67d1eb034d884b78d2dae7.png" />
<link rel="apple-touch-icon" type="image/x-icon" href="/assets/touch-icon-ipad-a6eec6aeb9da138e507593b464fdac213047e49d3093fc30e90d9a995df83ba3.png" sizes="76x76" />
<link rel="apple-touch-icon" type="image/x-icon" href="/assets/touch-icon-iphone-retina-72e2aadf86513a56e050e7f0f2355deaa19cc17ed97bbe5147847f2748e5a3e3.png" sizes="120x120" />
<link rel="apple-touch-icon" type="image/x-icon" href="/assets/touch-icon-ipad-retina-8ebe416f5313483d9c1bc772b5bbe03ecad52a54eba443e5215a22caed2a16a2.png" sizes="152x152" />
<link color="rgb(226, 67, 41)" href="/assets/logo-d36b5212042cebc89b96df4bf6ac24e43db316143e89926c0db839ff694d2de4.svg" rel="mask-icon">
<link href="/search/opensearch.xml" rel="search" title="Search GitLab" type="application/opensearchdescription+xml">
<meta content="/assets/msapplication-tile-1196ec67452f618d39cdd85e2e3a542f76574c071051ae7effbfde01710eb17d.png" name="msapplication-TileImage">
<meta content="#30353E" name="msapplication-TileColor">




</head>

<body class="ui-indigo tab-width-8 gl-browser-chrome gl-platform-windows" data-find-file="/Kelevra/formula1/-/find_file/master" data-namespace-id="929" data-page="projects:blob:show" data-page-type-id="master/README.md" data-project="formula1" data-project-id="20803">

<script>
//<![CDATA[
gl = window.gl || {};
gl.client = {"isChrome":true,"isWindows":true};


//]]>
</script>


<header class="navbar navbar-gitlab navbar-expand-sm js-navbar" data-qa-selector="navbar">
<a class="gl-sr-only gl-accessibility" href="#content-body">Skip to content</a>
<div class="container-fluid">
<div class="header-content">
<div class="title-container hide-when-top-nav-responsive-open">
<h1 class="title">
<span class="gl-sr-only">GitLab</span>
<a title="Панель керування" id="logo" href="/"><svg width="24" height="24" class="tanuki-logo" viewBox="0 0 36 36">
  <path class="tanuki-shape tanuki-left-ear" fill="#e24329" d="M2 14l9.38 9v-9l-4-12.28c-.205-.632-1.176-.632-1.38 0z"/>
  <path class="tanuki-shape tanuki-right-ear" fill="#e24329" d="M34 14l-9.38 9v-9l4-12.28c.205-.632 1.176-.632 1.38 0z"/>
  <path class="tanuki-shape tanuki-nose" fill="#e24329" d="M18,34.38 3,14 33,14 Z"/>
  <path class="tanuki-shape tanuki-left-eye" fill="#fc6d26" d="M18,34.38 11.38,14 2,14 6,25Z"/>
  <path class="tanuki-shape tanuki-right-eye" fill="#fc6d26" d="M18,34.38 24.62,14 34,14 30,25Z"/>
  <path class="tanuki-shape tanuki-left-cheek" fill="#fca326" d="M2 14L.1 20.16c-.18.565 0 1.2.5 1.56l17.42 12.66z"/>
  <path class="tanuki-shape tanuki-right-cheek" fill="#fca326" d="M34 14l1.9 6.16c.18.565 0 1.2-.5 1.56L18 34.38z"/>
</svg>

<span class="logo-text d-none d-lg-block gl-ml-3">
<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 617 169"><path d="M315.26 2.97h-21.8l.1 162.5h88.3v-20.1h-66.5l-.1-142.4M465.89 136.95c-5.5 5.7-14.6 11.4-27 11.4-16.6 0-23.3-8.2-23.3-18.9 0-16.1 11.2-23.8 35-23.8 4.5 0 11.7.5 15.4 1.2v30.1h-.1m-22.6-98.5c-17.6 0-33.8 6.2-46.4 16.7l7.7 13.4c8.9-5.2 19.8-10.4 35.5-10.4 17.9 0 25.8 9.2 25.8 24.6v7.9c-3.5-.7-10.7-1.2-15.1-1.2-38.2 0-57.6 13.4-57.6 41.4 0 25.1 15.4 37.7 38.7 37.7 15.7 0 30.8-7.2 36-18.9l4 15.9h15.4v-83.2c-.1-26.3-11.5-43.9-44-43.9M557.63 149.1c-8.2 0-15.4-1-20.8-3.5V70.5c7.4-6.2 16.6-10.7 28.3-10.7 21.1 0 29.2 14.9 29.2 39 0 34.2-13.1 50.3-36.7 50.3m9.2-110.6c-19.5 0-30 13.3-30 13.3v-21l-.1-27.8h-21.3l.1 158.5c10.7 4.5 25.3 6.9 41.2 6.9 40.7 0 60.3-26 60.3-70.9-.1-35.5-18.2-59-50.2-59M77.9 20.6c19.3 0 31.8 6.4 39.9 12.9l9.4-16.3C114.5 6 97.3 0 78.9 0 32.5 0 0 28.3 0 85.4c0 59.8 35.1 83.1 75.2 83.1 20.1 0 37.2-4.7 48.4-9.4l-.5-63.9V75.1H63.6v20.1h38l.5 48.5c-5 2.5-13.6 4.5-25.3 4.5-32.2 0-53.8-20.3-53.8-63-.1-43.5 22.2-64.6 54.9-64.6M231.43 2.95h-21.3l.1 27.3v94.3c0 26.3 11.4 43.9 43.9 43.9 4.5 0 8.9-.4 13.1-1.2v-19.1c-3.1.5-6.4.7-9.9.7-17.9 0-25.8-9.2-25.8-24.6v-65h35.7v-17.8h-35.7l-.1-38.5M155.96 165.47h21.3v-124h-21.3v124M155.96 24.37h21.3V3.07h-21.3v21.3"/></svg>

</span>
</a></h1>
<div class="gl-display-none gl-sm-display-block">
<ul class="list-unstyled navbar-sub-nav" data-view-model="{&quot;primary&quot;:[{&quot;id&quot;:&quot;project&quot;,&quot;title&quot;:&quot;Проєкти&quot;,&quot;active&quot;:true,&quot;icon&quot;:&quot;project&quot;,&quot;href&quot;:&quot;&quot;,&quot;view&quot;:&quot;projects&quot;,&quot;css_class&quot;:&quot;qa-projects-dropdown&quot;,&quot;data&quot;:{&quot;track_label&quot;:&quot;projects_dropdown&quot;,&quot;track_action&quot;:&quot;click_dropdown&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;groups&quot;,&quot;title&quot;:&quot;Groups&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;group&quot;,&quot;href&quot;:&quot;&quot;,&quot;view&quot;:&quot;groups&quot;,&quot;css_class&quot;:&quot;qa-groups-dropdown&quot;,&quot;data&quot;:{&quot;track_label&quot;:&quot;groups_dropdown&quot;,&quot;track_action&quot;:&quot;click_dropdown&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;milestones&quot;,&quot;title&quot;:&quot;Milestones&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;clock&quot;,&quot;href&quot;:&quot;/dashboard/milestones&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;milestones_link&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;snippets&quot;,&quot;title&quot;:&quot;Сніпети&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;snippet&quot;,&quot;href&quot;:&quot;/dashboard/snippets&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;snippets_link&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;activity&quot;,&quot;title&quot;:&quot;Activity&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;history&quot;,&quot;href&quot;:&quot;/dashboard/activity&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;activity_link&quot;},&quot;emoji&quot;:null}],&quot;secondary&quot;:[],&quot;views&quot;:{&quot;projects&quot;:{&quot;namespace&quot;:&quot;projects&quot;,&quot;currentUserName&quot;:&quot;Kelevra&quot;,&quot;currentItem&quot;:{&quot;id&quot;:20803,&quot;name&quot;:&quot;formula1&quot;,&quot;namespace&quot;:&quot;В&#39;ячеслав / formula1&quot;,&quot;webUrl&quot;:&quot;/Kelevra/formula1&quot;,&quot;avatarUrl&quot;:null},&quot;linksPrimary&quot;:[{&quot;id&quot;:&quot;your&quot;,&quot;title&quot;:&quot;Ваші проєкти&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/projects&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Ваші проєкти&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;starred&quot;,&quot;title&quot;:&quot;Обрані проєкти&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/projects/starred&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Обрані проєкти&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;explore&quot;,&quot;title&quot;:&quot;Огляд проєктів&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/explore&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Огляд проєктів&quot;},&quot;emoji&quot;:null}],&quot;linksSecondary&quot;:[{&quot;id&quot;:&quot;create&quot;,&quot;title&quot;:&quot;Створити новий проєкт&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/projects/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Створити новий проєкт&quot;},&quot;emoji&quot;:null}]},&quot;groups&quot;:{&quot;namespace&quot;:&quot;groups&quot;,&quot;currentUserName&quot;:&quot;Kelevra&quot;,&quot;currentItem&quot;:{},&quot;linksPrimary&quot;:[{&quot;id&quot;:&quot;your&quot;,&quot;title&quot;:&quot;Ваші групи&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/groups&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Ваші групи&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;explore&quot;,&quot;title&quot;:&quot;Огляд груп&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/explore/groups&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Огляд груп&quot;},&quot;emoji&quot;:null}],&quot;linksSecondary&quot;:[{&quot;id&quot;:&quot;create&quot;,&quot;title&quot;:&quot;Створити групу&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/groups/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Створити групу&quot;},&quot;emoji&quot;:null}]}},&quot;shortcuts&quot;:[{&quot;id&quot;:&quot;project-shortcut&quot;,&quot;title&quot;:&quot;Проєкти&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/projects&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-projects&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Проєкти&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;groups-shortcut&quot;,&quot;title&quot;:&quot;Groups&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/groups&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-groups&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Groups&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;milestones-shortcut&quot;,&quot;title&quot;:&quot;Milestones&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/milestones&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-milestones&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Milestones&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;snippets-shortcut&quot;,&quot;title&quot;:&quot;Сніпети&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/snippets&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-snippets&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Сніпети&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;activity-shortcut&quot;,&quot;title&quot;:&quot;Activity&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/activity&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-activity&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Activity&quot;},&quot;emoji&quot;:null}],&quot;activeTitle&quot;:&quot;Меню&quot;}" id="js-top-nav">
<li>
<a class="top-nav-toggle" data-toggle="dropdown" href="#" type="button">
<svg class="s16 dropdown-icon" data-testid="hamburger-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#hamburger"></use></svg>
Меню
</a>
</li>
</ul>
<div class="hidden">
<a class="dashboard-shortcuts-projects" href="/dashboard/projects">Проєкти
</a><a class="dashboard-shortcuts-groups" href="/dashboard/groups">Groups
</a><a class="dashboard-shortcuts-milestones" href="/dashboard/milestones">Milestones
</a><a class="dashboard-shortcuts-snippets" href="/dashboard/snippets">Сніпети
</a><a class="dashboard-shortcuts-activity" href="/dashboard/activity">Activity
</a></div>

</div>
</div>
<div class="navbar-collapse collapse">
<ul class="nav navbar-nav">
<li class="header-new dropdown gl-display-none gl-sm-display-block" data-track-action="click_dropdown" data-track-label="new_dropdown">
<a class="header-new-dropdown-toggle has-tooltip" id="js-onboarding-new-project-link" title="Новий..." ref="tooltip" aria-label="Новий..." data-toggle="dropdown" data-placement="bottom" data-container="body" data-display="static" data-qa-selector="new_menu_toggle" href="/projects/new"><svg class="s16" data-testid="plus-square-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#plus-square"></use></svg>
<svg class="s16 caret-down" data-testid="chevron-down-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#chevron-down"></use></svg>
</a><div class="dropdown-menu dropdown-menu-right dropdown-extended-height">
<ul>
<li class="dropdown-bold-header">
Цей проєкт
</li>
<li><a data-track-action="click_link_new_issue" data-track-label="plus_menu_dropdown" data-qa-selector="new_issue_link" href="/Kelevra/formula1/-/issues/new">Нова задача</a></li>
<li><a data-track-action="click_link_new_mr" data-track-label="plus_menu_dropdown" href="/Kelevra/formula1/-/merge_requests/new">Новий запит на злиття</a></li>
<li><a data-track-action="click_link_new_snippet_project" data-track-label="plus_menu_dropdown" href="/Kelevra/formula1/-/snippets/new">Новий сніпет</a></li>
<li class="divider"></li>
<li class="dropdown-bold-header">
GitLab
</li>
<li><a data-track-action="click_link_new_project" data-track-label="plus_menu_dropdown" data-qa-selector="global_new_project_link" href="/projects/new">Новий проєкт/репозиторій</a></li>
<li><a data-track-action="click_link_new_group" data-track-label="plus_menu_dropdown" href="/groups/new">Нова група</a></li>
<li><a data-track-action="click_link_new_snippet_parent" data-track-label="plus_menu_dropdown" data-qa-selector="global_new_snippet_link" href="/-/snippets/new">Новий сніпет</a></li>
</ul>
</div>
</li>

<li class="nav-item d-none d-lg-block m-auto">
<div class="search search-form" data-track-action="activate_form_input" data-track-label="navbar_search" data-track-value="">
<form class="form-inline form-control" action="/search" accept-charset="UTF-8" method="get"><div class="search-input-container">
<div class="search-input-wrap">
<div class="dropdown" data-url="/search/autocomplete">
<input type="search" name="search" id="search" placeholder="Search GitLab" class="search-input dropdown-menu-toggle no-outline js-search-dashboard-options" spellcheck="false" autocomplete="off" data-issues-path="/dashboard/issues" data-mr-path="/dashboard/merge_requests" data-qa-selector="search_term_field" aria-label="Search GitLab" />
<button class="hidden js-dropdown-search-toggle" data-toggle="dropdown" type="button"></button>
<div class="dropdown-menu dropdown-select" data-testid="dashboard-search-options">
<div class="dropdown-content"><ul>
<li class="dropdown-menu-empty-item">
<a>
Завантаження...
</a>
</li>
</ul>
</div><div class="dropdown-loading"><div class="gl-spinner-container"><span class="gl-spinner gl-spinner-orange gl-spinner-md gl-mt-7" aria-label="Завантаження"></span></div></div>
</div>
<svg class="s16 search-icon" data-testid="search-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#search"></use></svg>
<svg class="s16 clear-icon js-clear-input" data-testid="close-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#close"></use></svg>
</div>
</div>
</div>
<input type="hidden" name="group_id" id="group_id" value="" class="js-search-group-options" />
<input type="hidden" name="project_id" id="search_project_id" value="20803" class="js-search-project-options" data-project-path="formula1" data-name="formula1" data-issues-path="/Kelevra/formula1/-/issues" data-mr-path="/Kelevra/formula1/-/merge_requests" data-issues-disabled="false" />
<input type="hidden" name="scope" id="scope" />
<input type="hidden" name="search_code" id="search_code" value="true" />
<input type="hidden" name="snippets" id="snippets" value="false" />
<input type="hidden" name="repository_ref" id="repository_ref" value="master" />
<input type="hidden" name="nav_source" id="nav_source" value="navbar" />
<div class="search-autocomplete-opts hide" data-autocomplete-path="/search/autocomplete" data-autocomplete-project-id="20803" data-autocomplete-project-ref="master"></div>
</form></div>

</li>
<li class="nav-item d-none d-sm-inline-block d-lg-none">
<a title="Пошук" aria-label="Пошук" data-toggle="tooltip" data-placement="bottom" data-container="body" href="/search?project_id=20803"><svg class="s16" data-testid="search-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#search"></use></svg>
</a></li>
<li class="user-counter"><a title="Задачі" class="dashboard-shortcuts-issues" aria-label="Задачі" data-qa-selector="issues_shortcut_button" data-toggle="tooltip" data-placement="bottom" data-track-label="main_navigation" data-track-action="click_issues_link" data-track-property="navigation" data-container="body" href="/dashboard/issues?assignee_username=Kelevra"><svg class="s16" data-testid="issues-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#issues"></use></svg>
<span class="badge badge-pill issues-count green-badge hidden">
0
</span>
</a></li><li class="user-counter dropdown"><a class="dashboard-shortcuts-merge_requests" title="Запити на злиття" aria-label="Запити на злиття" data-qa-selector="merge_requests_shortcut_button" data-toggle="dropdown" data-placement="bottom" data-track-label="main_navigation" data-track-action="click_merge_link" data-track-property="navigation" data-container="body" href="/dashboard/merge_requests?assignee_username=Kelevra"><svg class="s16" data-testid="git-merge-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#git-merge"></use></svg>
<span class="badge badge-pill merge-requests-count js-merge-requests-count hidden">
0
</span>
<svg class="s16 caret-down gl-mx-0!" data-testid="chevron-down-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#chevron-down"></use></svg>
</a><div class="dropdown-menu dropdown-menu-right">
<ul>
<li class="dropdown-header">
Запити на злиття
</li>
<li>
<a class="gl-display-flex! gl-align-items-center" href="/dashboard/merge_requests?assignee_username=Kelevra">Назначено вам
<span class="badge gl-badge badge-pill badge-muted merge-request-badge gl-ml-auto js-assigned-mr-count">
0
</span>
</a></li>
<li>
<a class="gl-display-flex! gl-align-items-center" href="/dashboard/merge_requests?reviewer_username=Kelevra">Перегляньте запити для вас
<span class="badge gl-badge badge-pill badge-muted merge-request-badge gl-ml-auto js-reviewer-mr-count">
0
</span>
</a></li>
</ul>
</div>
</li><li class="user-counter"><a title="Список нагадувань" aria-label="Список нагадувань" class="shortcuts-todos" data-qa-selector="todos_shortcut_button" data-toggle="tooltip" data-placement="bottom" data-track-label="main_navigation" data-track-action="click_to_do_link" data-track-property="navigation" data-container="body" href="/dashboard/todos"><svg class="s16" data-testid="todo-done-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#todo-done"></use></svg>
<span class="badge badge-pill todos-count js-todos-count">
9
</span>
</a></li><li class="nav-item header-help dropdown d-none d-md-block">
<a class="header-help-dropdown-toggle" data-toggle="dropdown" href="/help"><span class="gl-sr-only">
Допомога
</span>
<svg class="s16" data-testid="question-o-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#question-o"></use></svg>
<span class="notification-dot rounded-circle gl-absolute"></span>
<svg class="s16 caret-down" data-testid="chevron-down-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#chevron-down"></use></svg>
</a><div class="dropdown-menu dropdown-menu-right">
<ul>
<li>
<button class="gl-justify-content-space-between gl-align-items-center js-whats-new-trigger gl-display-flex!" type="button">
Що нового
<span class="js-whats-new-notification-count gl-badge badge sm badge-dark badge-pill">
7
</span>
</button>
</li>

<li>
<a href="/help">Допомога</a>
</li>
<li>
<a href="https://about.gitlab.com/getting-help/">Підтримка</a>
</li>
<li>
<a target="_blank" class="text-nowrap" rel="noopener noreferrer" data-track-action="click_forum" data-track-property="question_menu" href="https://forum.gitlab.com/">Community forum</a>

</li>
<li>
<button class="js-shortcuts-modal-trigger" type="button">
Комбінації клавіш
<span aria-hidden="true" class="text-secondary float-right">?</span>
</button>
</li>
<li class="divider"></li>
<li>
<a href="https://about.gitlab.com/submit-feedback">Надіслати відгук</a>
</li>
<li>
<a target="_blank" class="text-nowrap" href="https://about.gitlab.com/contributing">Зробити внесок в GitLab
</a>
</li>

</ul>

</div>
</li>
<li class="nav-item header-user js-nav-user-dropdown dropdown" data-qa-selector="user_menu" data-track-action="click_dropdown" data-track-label="profile_dropdown" data-track-value="">
<a class="header-user-dropdown-toggle" data-toggle="dropdown" href="/Kelevra"><img width="23" height="23" class="header-user-avatar qa-user-avatar lazy" alt="В&#39;ячеслав" data-src="https://secure.gravatar.com/avatar/9cfea5dc1c818d2dd414e58b7de3f457?s=46&amp;d=identicon" src="data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==" />

<svg class="s16 caret-down" data-testid="chevron-down-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#chevron-down"></use></svg>
</a><div class="dropdown-menu dropdown-menu-right">
<ul>
<li class="current-user">
<a class="gl-line-height-20!" data-user="Kelevra" data-testid="user-profile-link" data-qa-selector="user_profile_link" href="/Kelevra"><div class="gl-font-weight-bold">
В&#39;ячеслав
</div>
@Kelevra

</a></li>
<li class="divider"></li>
<li>
<button class="gl-button btn btn-link menu-item js-set-status-modal-trigger" type="button">
Встановити статус
</button>
</li>
<li>
<a data-qa-selector="edit_profile_link" href="/-/profile">Редагувати профіль</a>
</li>
<li>
<a href="/-/profile/preferences">Налаштування</a>
</li>


<li class="divider d-md-none"></li>
<li class="d-md-none">
<a href="/help">Допомога</a>
</li>
<li class="d-md-none">
<a href="https://about.gitlab.com/getting-help/">Підтримка</a>
</li>
<li class="d-md-none">
<a target="_blank" class="text-nowrap" rel="noopener noreferrer" data-track-action="click_forum" data-track-property="question_menu" href="https://forum.gitlab.com/">Community forum</a>

</li>
<li class="d-md-none">
<a href="https://about.gitlab.com/submit-feedback">Надіслати відгук</a>
</li>
<li class="d-md-none">
<a target="_blank" class="text-nowrap" href="https://about.gitlab.com/contributing">Зробити внесок в GitLab
</a>
</li>

<li class="divider"></li>
<li>
<a class="sign-out-link" data-qa-selector="sign_out_link" rel="nofollow" data-method="post" href="/users/sign_out">Вийти</a>
</li>
</ul>

</div>
</li>
</ul>
</div>
<button class="navbar-toggler d-block d-sm-none gl-border-none!" data-testid="top-nav-responsive-toggle" type="button">
<span class="sr-only">Переключити навігацію</span>
<span class="more-icon gl-px-3 gl-font-sm gl-font-weight-bold">
<span class="gl-pr-2">Меню</span>
<svg class="s16" data-testid="hamburger-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#hamburger"></use></svg>
</span>
<svg class="s12 close-icon" data-testid="close-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#close"></use></svg>
</button>
</div>
</div>
</header>
<div data-version-digest="20859fc7798f69d4e4767e2f429bdeac01e15369144dd929b3a51f7663f75187" id="whats-new-app"></div>
<div class="js-set-status-modal-wrapper" data-current-emoji="" data-current-message="" data-default-emoji="speech_balloon"></div>

<div class="layout-page hide-when-top-nav-responsive-open page-with-contextual-sidebar">
<aside aria-label="Навігація по проєкту" class="nav-sidebar">
<div class="nav-sidebar-inner-scroll">
<ul class="sidebar-top-level-items" data-qa-selector="project_sidebar">
<li data-track-label="scope_menu" class="context-header"><a aria-label="formula1" class="shortcuts-project rspec-project-link" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Project scope" href="/Kelevra/formula1"><span class="avatar-container rect-avatar s32 project_avatar">
<span class="avatar avatar-tile s32 identicon bg7">F</span>
</span>
<span class="sidebar-context-title">
formula1
</span>
</a></li>
<li data-track-label="project_information_menu" class="home"><a aria-label="Інформація про проєкт" class="shortcuts-project-information has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Інформація про проєкт" href="/Kelevra/formula1/activity"><span class="nav-icon-container">
<svg class="s16" data-testid="project-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#project"></use></svg>
</span>
<span class="nav-item-name">
Інформація про проєкт
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Інформація про проєкт
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="activity" class=""><a aria-label="Активність" class="shortcuts-project-activity" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Активність" href="/Kelevra/formula1/activity"><span>
Активність
</span>
</a></li><li data-track-label="labels" class=""><a aria-label="Мітки" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Мітки" href="/Kelevra/formula1/-/labels"><span>
Мітки
</span>
</a></li><li data-track-label="members" class=""><a aria-label="Користувачі" id="js-onboarding-members-link" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Користувачі" href="/Kelevra/formula1/-/project_members"><span>
Користувачі
</span>
</a></li>
</ul>
</li><li data-track-label="repository_menu" class="active"><a aria-label="Репозиторій" class="shortcuts-tree has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Репозиторій" href="/Kelevra/formula1/-/tree/master"><span class="nav-icon-container">
<svg class="s16" data-testid="doc-text-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#doc-text"></use></svg>
</span>
<span class="nav-item-name" id="js-onboarding-repo-link">
Репозиторій
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item active"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Репозиторій
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="files" class="active"><a aria-label="Файли" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Файли" href="/Kelevra/formula1/-/tree/master"><span>
Файли
</span>
</a></li><li data-track-label="commits" class=""><a aria-label="Коміти" id="js-onboarding-commits-link" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Коміти" href="/Kelevra/formula1/-/commits/master"><span>
Коміти
</span>
</a></li><li data-track-label="branches" class=""><a aria-label="Гілки" id="js-onboarding-branches-link" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Гілки" href="/Kelevra/formula1/-/branches"><span>
Гілки
</span>
</a></li><li data-track-label="tags" class=""><a aria-label="Теги" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Теги" href="/Kelevra/formula1/-/tags"><span>
Теги
</span>
</a></li><li data-track-label="contributors" class=""><a aria-label="Учасники" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Учасники" href="/Kelevra/formula1/-/graphs/master"><span>
Учасники
</span>
</a></li><li data-track-label="graphs" class=""><a aria-label="Граф" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Граф" href="/Kelevra/formula1/-/network/master"><span>
Граф
</span>
</a></li><li data-track-label="compare" class=""><a aria-label="Порівняти" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Порівняти" href="/Kelevra/formula1/-/compare?from=master&amp;to=master"><span>
Порівняти
</span>
</a></li>
</ul>
</li><li data-track-label="issues_menu" class=""><a aria-label="Задачі" class="shortcuts-issues has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Задачі" href="/Kelevra/formula1/-/issues"><span class="nav-icon-container">
<svg class="s16" data-testid="issues-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#issues"></use></svg>
</span>
<span class="nav-item-name" id="js-onboarding-issues-link">
Задачі
</span>
<span class="badge badge-pill count issue_counter">
0
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Задачі
</strong>
<span class="badge badge-pill count fly-out-badge issue_counter">
0
</span>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="issue_list" class=""><a aria-label="Задачі" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Список" href="/Kelevra/formula1/-/issues"><span>
Список
</span>
</a></li><li data-track-label="boards" class=""><a aria-label="Дошки" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Дошки" href="/Kelevra/formula1/-/boards"><span>
Дошки
</span>
</a></li><li data-track-label="service_desk" class=""><a aria-label="Service Desk" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Service Desk" href="/Kelevra/formula1/-/issues/service_desk"><span>
Service Desk
</span>
</a></li><li data-track-label="milestones" class=""><a aria-label="Етапи" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Етапи" href="/Kelevra/formula1/-/milestones"><span>
Етапи
</span>
</a></li>
</ul>
</li><li data-track-label="merge_requests_menu" class=""><a aria-label="Запити на злиття" class="shortcuts-merge_requests" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Запити на злиття" href="/Kelevra/formula1/-/merge_requests"><span class="nav-icon-container">
<svg class="s16" data-testid="git-merge-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#git-merge"></use></svg>
</span>
<span class="nav-item-name" id="js-onboarding-mr-link">
Запити на злиття
</span>
<span class="badge badge-pill count merge_counter js-merge-counter">
0
</span>
</a><ul class="sidebar-sub-level-items is-fly-out-only">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Запити на злиття
</strong>
<span class="badge badge-pill count fly-out-badge merge_counter js-merge-counter">
0
</span>
</span>
</li></ul>
</li><li data-track-label="ci_cd_menu" class=""><a aria-label="CI/CD" class="shortcuts-pipelines rspec-link-pipelines has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="CI/CD" href="/Kelevra/formula1/-/pipelines"><span class="nav-icon-container">
<svg class="s16" data-testid="rocket-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#rocket"></use></svg>
</span>
<span class="nav-item-name" id="js-onboarding-pipelines-link">
CI/CD
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
CI/CD
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="pipelines" class=""><a aria-label="Конвеєри" class="shortcuts-pipelines" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Конвеєри" href="/Kelevra/formula1/-/pipelines"><span>
Конвеєри
</span>
</a></li><li data-track-label="pipelines_editor" class=""><a aria-label="Редактор" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Редактор" href="/Kelevra/formula1/-/ci/editor"><span>
Редактор
</span>
</a></li><li data-track-label="jobs" class=""><a aria-label="Завдання" class="shortcuts-builds" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Завдання" href="/Kelevra/formula1/-/jobs"><span>
Завдання
</span>
</a></li><li data-track-label="pipeline_schedules" class=""><a aria-label="Розклади" class="shortcuts-builds" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Розклади" href="/Kelevra/formula1/-/pipeline_schedules"><span>
Розклади
</span>
</a></li>
</ul>
</li><li data-track-label="security_compliance_menu" class=""><a aria-label="Безпека та відповідність" class="has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Безпека та відповідність" href="/Kelevra/formula1/-/security/configuration"><span class="nav-icon-container">
<svg class="s16" data-testid="shield-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#shield"></use></svg>
</span>
<span class="nav-item-name">
Безпека та відповідність
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Безпека та відповідність
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="configuration" class=""><a aria-label="Конфігурація" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Конфігурація" href="/Kelevra/formula1/-/security/configuration"><span>
Конфігурація
</span>
</a></li>
</ul>
</li><li data-track-label="deployments_menu" class=""><a aria-label="Розгортання" class="shortcuts-deployments has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Розгортання" href="/Kelevra/formula1/-/feature_flags"><span class="nav-icon-container">
<svg class="s16" data-testid="environment-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#environment"></use></svg>
</span>
<span class="nav-item-name">
Розгортання
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Розгортання
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="feature_flags" class=""><a aria-label="Перемикачі функцій" class="shortcuts-feature-flags" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Перемикачі функцій" href="/Kelevra/formula1/-/feature_flags"><span>
Перемикачі функцій
</span>
</a></li><li data-track-label="environments" class=""><a aria-label="Середовища" class="shortcuts-environments" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Середовища" href="/Kelevra/formula1/-/environments"><span>
Середовища
</span>
</a></li><li data-track-label="releases" class=""><a aria-label="Релізи" class="shortcuts-deployments-releases" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Релізи" href="/Kelevra/formula1/-/releases"><span>
Релізи
</span>
</a></li>
</ul>
</li><li data-track-label="monitor_menu" class=""><a aria-label="Монітор" class="shortcuts-monitor has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Монітор" href="/Kelevra/formula1/-/metrics"><span class="nav-icon-container">
<svg class="s16" data-testid="monitor-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#monitor"></use></svg>
</span>
<span class="nav-item-name">
Монітор
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Монітор
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="metrics" class=""><a aria-label="Метрики" class="shortcuts-metrics" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Метрики" href="/Kelevra/formula1/-/metrics"><span>
Метрики
</span>
</a></li><li data-track-label="logs" class=""><a aria-label="Логи" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Логи" href="/Kelevra/formula1/-/logs"><span>
Логи
</span>
</a></li><li data-track-label="tracing" class=""><a aria-label="Відстеження" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Відстеження" href="/Kelevra/formula1/-/tracing"><span>
Відстеження
</span>
</a></li><li data-track-label="error_tracking" class=""><a aria-label="Відстеження помилок" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Відстеження помилок" href="/Kelevra/formula1/-/error_tracking"><span>
Відстеження помилок
</span>
</a></li><li data-track-label="alert_management" class=""><a aria-label="Попередження" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Попередження" href="/Kelevra/formula1/-/alert_management"><span>
Попередження
</span>
</a></li><li data-track-label="incidents" class=""><a aria-label="Інциденти" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Інциденти" href="/Kelevra/formula1/-/incidents"><span>
Інциденти
</span>
</a></li>
</ul>
</li><li data-track-label="infrastructure_menu" class=""><a aria-label="Інфраструктура" class="shortcuts-infrastructure has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Інфраструктура" href="/Kelevra/formula1/-/clusters"><span class="nav-icon-container">
<svg class="s16" data-testid="cloud-gear-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#cloud-gear"></use></svg>
</span>
<span class="nav-item-name">
Інфраструктура
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Інфраструктура
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="kubernetes" class=""><a aria-label="Kubernetes clusters" class="shortcuts-kubernetes" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Kubernetes clusters" href="/Kelevra/formula1/-/clusters"><span>
Kubernetes clusters
</span>
</a></li><li data-track-label="serverless" class=""><a aria-label="Serverless platform" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Serverless platform" href="/Kelevra/formula1/-/serverless/functions"><span>
Serverless platform
</span>
</a></li><li data-track-label="terraform" class=""><a aria-label="Terraform" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Terraform" href="/Kelevra/formula1/-/terraform"><span>
Terraform
</span>
</a></li>
</ul>
</li><li data-track-label="packages_registries_menu" class=""><a aria-label="Пакети та реєстри" class="has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Пакети та реєстри" href="/Kelevra/formula1/-/packages"><span class="nav-icon-container">
<svg class="s16" data-testid="package-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#package"></use></svg>
</span>
<span class="nav-item-name">
Пакети та реєстри
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Пакети та реєстри
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="packages_registry" class=""><a aria-label="Реєстр пакетів" class="shortcuts-container-registry" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Реєстр пакетів" href="/Kelevra/formula1/-/packages"><span>
Реєстр пакетів
</span>
</a></li><li data-track-label="infrastructure_registry" class=""><a aria-label="Реєстр інфраструктури" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Реєстр інфраструктури" href="/Kelevra/formula1/-/infrastructure_registry"><span>
Реєстр інфраструктури
</span>
</a></li>
</ul>
</li><li data-track-label="analytics_menu" class=""><a aria-label="Аналітика" class="shortcuts-analytics has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Аналітика" href="/Kelevra/formula1/-/value_stream_analytics"><span class="nav-icon-container">
<svg class="s16" data-testid="chart-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#chart"></use></svg>
</span>
<span class="nav-item-name">
Аналітика
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Аналітика
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="ci_cd_analytics" class=""><a aria-label="CI/CD" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="CI/CD" href="/Kelevra/formula1/-/pipelines/charts"><span>
CI/CD
</span>
</a></li><li data-track-label="repository_analytics" class=""><a aria-label="Репозиторій" class="shortcuts-repository-charts" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Репозиторій" href="/Kelevra/formula1/-/graphs/master/charts"><span>
Репозиторій
</span>
</a></li><li data-track-label="cycle_analytics" class=""><a aria-label="Value stream" class="shortcuts-project-cycle-analytics" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Value stream" href="/Kelevra/formula1/-/value_stream_analytics"><span>
Value stream
</span>
</a></li>
</ul>
</li><li data-track-label="wiki_menu" class=""><a aria-label="Вікі" class="shortcuts-wiki" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Вікі" href="/Kelevra/formula1/-/wikis/home"><span class="nav-icon-container">
<svg class="s16" data-testid="book-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#book"></use></svg>
</span>
<span class="nav-item-name">
Вікі
</span>
</a><ul class="sidebar-sub-level-items is-fly-out-only">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Вікі
</strong>
</span>
</li></ul>
</li><li data-track-label="snippets_menu" class=""><a aria-label="Сніпети" class="shortcuts-snippets" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Сніпети" href="/Kelevra/formula1/-/snippets"><span class="nav-icon-container">
<svg class="s16" data-testid="snippet-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#snippet"></use></svg>
</span>
<span class="nav-item-name">
Сніпети
</span>
</a><ul class="sidebar-sub-level-items is-fly-out-only">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Сніпети
</strong>
</span>
</li></ul>
</li><li data-track-label="settings_menu" class=""><a aria-label="Налаштування" class="has-sub-items" data-qa-selector="sidebar_menu_link" data-qa-menu-item="Налаштування" href="/Kelevra/formula1/edit"><span class="nav-icon-container">
<svg class="s16" data-testid="settings-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#settings"></use></svg>
</span>
<span class="nav-item-name" id="js-onboarding-settings-link">
Налаштування
</span>
</a><ul class="sidebar-sub-level-items">
<li class="fly-out-top-item"><span class="fly-out-top-item-container">
<strong class="fly-out-top-item-name">
Налаштування
</strong>
</span>
</li><li class="divider fly-out-top-item"></li>
<li data-track-label="general" class=""><a aria-label="Загальні" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Загальні" href="/Kelevra/formula1/edit"><span>
Загальні
</span>
</a></li><li data-track-label="integrations" class=""><a aria-label="Інтеграції" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Інтеграції" href="/Kelevra/formula1/-/settings/integrations"><span>
Інтеграції
</span>
</a></li><li data-track-label="webhooks" class=""><a aria-label="Веб-хуки" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Веб-хуки" href="/Kelevra/formula1/-/hooks"><span>
Веб-хуки
</span>
</a></li><li data-track-label="access_tokens" class=""><a aria-label="Токени доступу" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Токени доступу" href="/Kelevra/formula1/-/settings/access_tokens"><span>
Токени доступу
</span>
</a></li><li data-track-label="repository" class=""><a aria-label="Репозиторій" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Репозиторій" href="/Kelevra/formula1/-/settings/repository"><span>
Репозиторій
</span>
</a></li><li data-track-label="ci_cd" class=""><a aria-label="CI/CD" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="CI/CD" href="/Kelevra/formula1/-/settings/ci_cd"><span>
CI/CD
</span>
</a></li><li data-track-label="monitor" class=""><a aria-label="Монітор" data-qa-selector="sidebar_menu_item_link" data-qa-menu-item="Монітор" href="/Kelevra/formula1/-/settings/operations"><span>
Монітор
</span>
</a></li>
</ul>
</li>
<li class="hidden">
<a aria-label="Активність" class="shortcuts-project-activity" href="/Kelevra/formula1/activity">Активність
</a></li>
<li class="hidden">
<a aria-label="Граф" class="shortcuts-network" href="/Kelevra/formula1/-/network/master">Граф
</a></li>
<li class="hidden">
<a aria-label="Створити нову задачу" class="shortcuts-new-issue" href="/Kelevra/formula1/-/issues/new">Створити нову задачу
</a></li>
<li class="hidden">
<a aria-label="Завдання" class="shortcuts-builds" href="/Kelevra/formula1/-/jobs">Завдання
</a></li>
<li class="hidden">
<a aria-label="Коміти" class="shortcuts-commits" href="/Kelevra/formula1/-/commits/master">Коміти
</a></li>
<li class="hidden">
<a aria-label="Дошки обговорення задач" class="shortcuts-issue-boards" href="/Kelevra/formula1/-/boards">Дошки обговорення задач
</a></li>

</ul>
<a class="toggle-sidebar-button js-toggle-sidebar qa-toggle-sidebar rspec-toggle-sidebar" role="button" title="Toggle sidebar" type="button">
<svg class="s16 icon-chevron-double-lg-left" data-testid="chevron-double-lg-left-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#chevron-double-lg-left"></use></svg>
<span class="collapse-text gl-ml-3">Згорнути панель</span>
</a>
<button name="button" type="button" class="close-nav-button"><svg class="s16" data-testid="close-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#close"></use></svg>
<span class="collapse-text gl-ml-3">Закрити бічну панель</span>
</button>
</div>
</aside>


<div class="content-wrapper content-wrapper-margin">
<div class="mobile-overlay"></div>

<div class="alert-wrapper gl-force-block-formatting-context">
















<nav aria-label="Breadcrumbs" class="breadcrumbs container-fluid container-limited">
<div class="breadcrumbs-container">
<button name="button" type="button" class="toggle-mobile-nav"><span class="sr-only">Розгорніть бічну панель</span>
<svg class="s18" data-testid="hamburger-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#hamburger"></use></svg>
</button><div class="breadcrumbs-links" data-qa-selector="breadcrumb_links_content" data-testid="breadcrumb-links">
<ul class="list-unstyled breadcrumbs-list js-breadcrumbs-list">
<li><a href="/Kelevra">В'ячеслав</a><svg class="s8 breadcrumbs-list-angle" data-testid="angle-right-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#angle-right"></use></svg></li> <li><a href="/Kelevra/formula1"><span class="breadcrumb-item-text js-breadcrumb-item-text">formula1</span></a><svg class="s8 breadcrumbs-list-angle" data-testid="angle-right-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#angle-right"></use></svg></li>

<li>
<h2 class="breadcrumbs-sub-title">
<a href="/Kelevra/formula1/-/blob/master/README.md">Репозиторій</a>
</h2>
</li>
</ul>
</div>
<script type="application/ld+json">
{"@context":"https://schema.org","@type":"BreadcrumbList","itemListElement":[{"@type":"ListItem","position":1,"name":"В'ячеслав","item":"https://git.foxminded.com.ua/Kelevra"},{"@type":"ListItem","position":2,"name":"formula1","item":"https://git.foxminded.com.ua/Kelevra/formula1"},{"@type":"ListItem","position":3,"name":"Репозиторій","item":"https://git.foxminded.com.ua/Kelevra/formula1/-/blob/master/README.md"}]}

</script>

</div>
</nav>

</div>
<div class="container-fluid container-limited ">
<main class="content" id="content-body" itemscope itemtype="http://schema.org/SoftwareSourceCode">
<div class="flash-container flash-container-page sticky" data-qa-selector="flash_container">
</div>


<div class="js-signature-container" data-signatures-path="/Kelevra/formula1/-/commits/a0c21160e195195fd23a8550e53f4749d1427242/signatures?limit=1"></div>

<div class="tree-holder" id="tree-holder">
<div class="nav-block">
<div class="tree-ref-container">
<div class="tree-ref-holder">
<form class="project-refs-form" action="/Kelevra/formula1/-/refs/switch" accept-charset="UTF-8" method="get"><input type="hidden" name="destination" id="destination" value="blob" />
<input type="hidden" name="path" id="path" value="README.md" />
<div class="dropdown">
<button class="dropdown-menu-toggle js-project-refs-dropdown qa-branches-select" type="button" data-toggle="dropdown" data-selected="master" data-ref="master" data-refs-url="/Kelevra/formula1/refs?sort=updated_desc" data-field-name="ref" data-submit-form-on-click="true" data-visit="true"><span class="dropdown-toggle-text ">master</span><svg class="s16 dropdown-menu-toggle-icon gl-top-3" data-testid="chevron-down-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#chevron-down"></use></svg></button>
<div class="dropdown-menu dropdown-menu-selectable git-revision-dropdown dropdown-menu-paging qa-branches-dropdown">
<div class="dropdown-page-one">
<div class="dropdown-title gl-display-flex"><span class="gl-ml-auto">Перейти в гілку/тег</span><button class="dropdown-title-button dropdown-menu-close gl-ml-auto" aria-label="Close" type="button"><svg class="s16 dropdown-menu-close-icon" data-testid="close-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#close"></use></svg></button></div>
<div class="dropdown-input"><input type="search" data-qa-selector="dropdown_input_field" class="dropdown-input-field" placeholder="Пошук гілок та тегів" autocomplete="off" /><svg class="s16 dropdown-input-search" data-testid="search-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#search"></use></svg><svg class="s16 dropdown-input-clear js-dropdown-input-clear" data-testid="close-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#close"></use></svg></div>
<div class="dropdown-content"></div>
<div class="dropdown-loading"><div class="gl-spinner-container"><span class="gl-spinner gl-spinner-orange gl-spinner-md gl-mt-7" aria-label="Завантаження"></span></div></div>
</div>
</div>
</div>
</form>
</div>
<ul class="breadcrumb repo-breadcrumb">
<li class="breadcrumb-item">
<a href="/Kelevra/formula1/-/tree/master">formula1
</a></li>
<li class="breadcrumb-item">
<a href="/Kelevra/formula1/-/blob/master/README.md"><strong>README.md</strong>
</a></li>
</ul>
</div>
<div class="tree-controls gl-children-ml-sm-3"><a class="gl-button btn btn-default shortcuts-find-file" rel="nofollow" href="/Kelevra/formula1/-/find_file/master">Знайти файл
</a><a class="gl-button btn btn-default js-blob-blame-link" href="/Kelevra/formula1/-/blame/master/README.md">Blame</a><a class="gl-button btn btn-default" href="/Kelevra/formula1/-/commits/master/README.md">History</a><a class="gl-button btn btn-default js-data-file-blob-permalink-url" href="/Kelevra/formula1/-/blob/11a739c28509961d6bdd61ed4f956619236e0919/README.md">Permalink</a></div>
</div>

<div class="info-well d-none d-sm-block">
<div class="well-segment">
<ul class="blob-commit-info">
<li class="commit flex-row js-toggle-container" id="commit-a0c21160">
<div class="avatar-cell d-none d-sm-block">
<a href="/Kelevra"><img alt="В&#39;ячеслав&#39;s avatar" src="https://secure.gravatar.com/avatar/9cfea5dc1c818d2dd414e58b7de3f457?s=80&amp;d=identicon" class="avatar s40 d-none d-sm-inline-block" title="В&#39;ячеслав" /></a>
</div>
<div class="commit-detail flex-list">
<div class="commit-content" data-qa-selector="commit_content">
<a class="commit-row-message item-title js-onboarding-commit-item " href="/Kelevra/formula1/-/commit/a0c21160e195195fd23a8550e53f4749d1427242">Update README.md</a>
<span class="commit-row-message d-inline d-sm-none">
&middot;
a0c21160
</span>
<div class="committer">
<a class="commit-author-link js-user-link" data-user-id="883" href="/Kelevra">В&#39;ячеслав</a> закомітив <time class="js-timeago" title="вер. 21, 2021 12:57по полудні" datetime="2021-09-21T12:57:58Z" data-toggle="tooltip" data-placement="bottom" data-container="body">вер. 21, 2021</time>
</div>

</div>
<div class="commit-actions flex-row">

<div class="js-commit-pipeline-status" data-endpoint="/Kelevra/formula1/-/commit/a0c21160e195195fd23a8550e53f4749d1427242/pipelines?ref=master"></div>
<div class="commit-sha-group btn-group d-none d-sm-flex">
<div class="label label-monospace monospace">
a0c21160
</div>
<button class="btn gl-button btn btn-default btn-icon" data-toggle="tooltip" data-placement="bottom" data-container="body" data-title="Скопіювати SHA коміту" data-class="gl-button btn btn-default btn-icon" data-clipboard-text="a0c21160e195195fd23a8550e53f4749d1427242" type="button" title="Скопіювати SHA коміту" aria-label="Скопіювати SHA коміту"><svg class="s16 gl-icon" data-testid="copy-to-clipboard-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#copy-to-clipboard"></use></svg></button>

</div>
</div>
</div>
</li>

</ul>
</div>


</div>
<div class="blob-content-holder" id="blob-content-holder">
<article class="file-holder">
<div class="js-file-title file-title-flex-parent">
<div class="file-header-content">
<div class="js-table-contents"></div>
<svg class="s16" data-testid="doc-text-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#doc-text"></use></svg>
<strong class="file-title-name gl-word-break-all" data-qa-selector="file_name_content">
README.md
</strong>
<button class="btn gl-button btn btn-default-tertiary btn-icon btn-sm" data-toggle="tooltip" data-placement="bottom" data-container="body" data-class="gl-button btn btn-default-tertiary btn-icon btn-sm" data-title="Скопіювати шлях до файлу" data-clipboard-text="{&quot;text&quot;:&quot;README.md&quot;,&quot;gfm&quot;:&quot;`README.md`&quot;}" type="button" title="Скопіювати шлях до файлу" aria-label="Скопіювати шлях до файлу"><svg class="s16 gl-icon" data-testid="copy-to-clipboard-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#copy-to-clipboard"></use></svg></button>
<small class="mr-1">
93 байту
</small>
</div>

<div class="file-actions gl-display-flex gl-align-items-center gl-flex-wrap gl-md-justify-content-end"><div class="btn-group js-blob-viewer-switcher gl-ml-3" role="group">
<button aria-label="Display source" class="btn gl-button btn-default btn-icon js-blob-viewer-switch-btn has-tooltip" data-container="body" data-viewer="simple" title="Display source">
<svg class="s16" data-testid="code-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#code"></use></svg>
</button><button aria-label="Display rendered file" class="btn gl-button btn-default btn-icon js-blob-viewer-switch-btn has-tooltip" data-container="body" data-viewer="rich" title="Display rendered file">
<svg class="s16" data-testid="doc-text-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#doc-text"></use></svg>
</button></div><a class="btn gl-button btn-confirm js-edit-blob gl-ml-3 " data-track-action="click_edit" data-track-label="edit" href="/Kelevra/formula1/-/edit/master/README.md">Редагувати</a><a class="btn gl-button btn-confirm ide-edit-button gl-ml-3 btn-inverted" data-track-action="click_edit_ide" data-track-label="web_ide" data-track-property="secondary" href="/-/ide/project/Kelevra/formula1/edit/master/-/README.md">Веб-IDE</a><div class="btn-group gl-ml-3" role="group">

<button name="button" type="submit" class="btn gl-button btn-default btn-default" data-target="#modal-upload-blob" data-toggle="modal">Замінити</button>
<button name="button" type="submit" class="btn gl-button btn-default btn-default" data-target="#modal-remove-blob" data-toggle="modal">Видалити</button>
</div><div class="btn-group gl-ml-3" role="group">
<span class="btn-group has-tooltip js-copy-blob-source-btn-tooltip"><button class="btn btn gl-button btn-default btn-icon js-copy-blob-source-btn" data-class="btn gl-button btn-default btn-icon js-copy-blob-source-btn" data-hide-tooltip="true" data-clipboard-target=".blob-content[data-blob-id=&#39;db38720bfc71c71a9a837b57d54eea7b4b102eae&#39;] &gt; pre" type="button" title="Скопіювати" aria-label="Скопіювати"><svg class="s16 gl-icon" data-testid="copy-to-clipboard-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#copy-to-clipboard"></use></svg></button></span>
<a class="btn gl-button btn-default btn-icon has-tooltip" target="_blank" rel="noopener noreferrer" aria-label="Відкрити в неформатованому вигляді" title="Відкрити в неформатованому вигляді" data-container="body" href="/Kelevra/formula1/-/raw/master/README.md"><svg class="s16" data-testid="doc-code-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#doc-code"></use></svg></a>
<a download="README.md" class="btn gl-button btn-default btn-icon has-tooltip" target="_blank" rel="noopener noreferrer" aria-label="Завантажити" title="Завантажити" data-container="body" href="/Kelevra/formula1/-/raw/master/README.md?inline=false"><svg class="s16" data-testid="download-icon"><use href="/assets/icons-319de3b47bd085e8b73de84bed6ed3eb7fb318aadf14d14ff781ba9a32129b45.svg#download"></use></svg></a>

</div></div>
</div>
<div class="js-file-fork-suggestion-section file-fork-suggestion hidden">
<span class="file-fork-suggestion-note">You can’t <span class="js-file-fork-suggestion-section-action">edit</span> files directly in this project. Fork this project and submit a merge request with your changes.</span>
<a class="js-fork-suggestion-button gl-button btn btn-grouped btn-confirm-secondary" rel="nofollow" data-method="post" href="/Kelevra/formula1/-/blob/master/README.md">Fork</a>
<button class="js-cancel-fork-suggestion-button gl-button btn btn-grouped" type="button">
Скасувати
</button>
</div>



<div class="blob-viewer hidden" data-path="README.md" data-type="simple" data-url="/Kelevra/formula1/-/blob/master/README.md?format=json&amp;viewer=simple">
<div class="text-center gl-mt-4 gl-mb-3">
<span class="gl-spinner gl-spinner-orange gl-spinner-md qa-spinner" aria-label="Завантаження"></span>
</div>

</div>

<div class="blob-viewer" data-path="README.md" data-rich-type="markup" data-type="rich" data-url="/Kelevra/formula1/-/blob/master/README.md?format=json&amp;viewer=rich">
<div class="text-center gl-mt-4 gl-mb-3">
<span class="gl-spinner gl-spinner-orange gl-spinner-md qa-spinner" aria-label="Завантаження"></span>
</div>

</div>


</article>
</div>

<div class="modal" id="modal-remove-blob">
<div class="modal-dialog">
<div class="modal-content">
<div class="modal-header">
<h3 class="page-title">Delete README.md</h3>
<button aria-label="Закрити" class="close" data-dismiss="modal" type="button">
<span aria-hidden="true">&times;</span>
</button>
</div>
<div class="modal-body">
<form class="js-delete-blob-form js-quick-submit js-requires-input" action="/Kelevra/formula1/-/blob/master/README.md" accept-charset="UTF-8" method="post"><input type="hidden" name="_method" value="delete" /><input type="hidden" name="authenticity_token" value="9J+gCrzS8XrM7wcc7txL5JClKW6/pP1beE2s5ISy0XpsDvldEXyE/YaF5F1hQr9YgnQMU5mgKZcY79xE2U+eFQ==" /><div class="form-group row commit_message-group">
<label class="col-form-label col-sm-2" for="commit_message-3961117c5239e0570b876fdfc1ece264">Повідомлення коміту
</label><div class="col-sm-10">
<div class="commit-message-container">
<div class="max-width-marker"></div>
<textarea name="commit_message" id="commit_message-3961117c5239e0570b876fdfc1ece264" class="form-control gl-form-input js-commit-message" placeholder="Delete README.md" data-qa-selector="commit_message_field" required="required" rows="3">
Delete README.md</textarea>
</div>
</div>
</div>

<div class="form-group row branch">
<label class="col-form-label col-sm-2" for="branch_name">Цільова гілка</label>
<div class="col-sm-10">
<input type="text" name="branch_name" id="branch_name" value="master" required="required" class="form-control gl-form-input js-branch-name ref-name" />
<div class="js-create-merge-request-container">
<div class="form-check gl-mt-3">
<input type="checkbox" name="create_merge_request" id="create_merge_request-7708ce2a9fa0a48c5471f85211e74fd2" value="1" class="js-create-merge-request form-check-input" checked="checked" />
<label class="form-check-label" for="create_merge_request-7708ce2a9fa0a48c5471f85211e74fd2">Почати <strong>Новий запит на злиття</strong> з цими змінами
</label></div>

</div>
</div>
</div>
<input type="hidden" name="original_branch" id="original_branch" value="master" class="js-original-branch" />

<div class="form-group row">
<div class="offset-sm-2 col-sm-10">
<button name="button" type="submit" class="btn gl-button btn-danger btn-remove-file">Delete file</button>
<a class="btn gl-button btn-cancel" data-dismiss="modal" href="#">Скасувати</a>
</div>
</div>
</form></div>
</div>
</div>
</div>

<div class="modal" id="modal-upload-blob">
<div class="modal-dialog modal-lg">
<div class="modal-content">
<div class="modal-header">
<h3 class="page-title">Replace README.md</h3>
<button aria-label="Закрити" class="close" data-dismiss="modal" type="button">
<span aria-hidden="true">&times;</span>
</button>
</div>
<div class="modal-body">
<form class="js-quick-submit js-upload-blob-form" data-method="put" action="/Kelevra/formula1/-/update/master/README.md" accept-charset="UTF-8" method="post"><input type="hidden" name="_method" value="put" /><input type="hidden" name="authenticity_token" value="X+i6PJkC4ogxKGL+WtMmcaZOYPezULVnNNOURy2aw93HeeNrNKyXD3tCgb/VTdLNtJ9FypVUYatUceTncGeMsg==" /><div class="dropzone">
<div class="dropzone-previews blob-upload-dropzone-previews">
<p class="dz-message light">
Прикріпити файл за допомогою перетягування або <a class="markdown-selector" href="#">Натисніть, щоб надіслати</a>
</p>
</div>
</div>
<br>
<div class="dropzone-alerts gl-alert gl-alert-danger gl-mb-5 data" style="display:none"></div>
<div class="form-group row commit_message-group">
<label class="col-form-label col-sm-2" for="commit_message-e0886d1dfa66772226a7dfec74278ea8">Повідомлення коміту
</label><div class="col-sm-10">
<div class="commit-message-container">
<div class="max-width-marker"></div>
<textarea name="commit_message" id="commit_message-e0886d1dfa66772226a7dfec74278ea8" class="form-control gl-form-input js-commit-message" placeholder="Replace README.md" data-qa-selector="commit_message_field" required="required" rows="3">
Replace README.md</textarea>
</div>
</div>
</div>

<div class="form-group row branch">
<label class="col-form-label col-sm-2" for="branch_name">Цільова гілка</label>
<div class="col-sm-10">
<input type="text" name="branch_name" id="branch_name" value="master" required="required" class="form-control gl-form-input js-branch-name ref-name" />
<div class="js-create-merge-request-container">
<div class="form-check gl-mt-3">
<input type="checkbox" name="create_merge_request" id="create_merge_request-05cf21d45383c5224eccbc82b4a8ad06" value="1" class="js-create-merge-request form-check-input" checked="checked" />
<label class="form-check-label" for="create_merge_request-05cf21d45383c5224eccbc82b4a8ad06">Почати <strong>Новий запит на злиття</strong> з цими змінами
</label></div>

</div>
</div>
</div>
<input type="hidden" name="original_branch" id="original_branch" value="master" class="js-original-branch" />

<div class="form-actions">
<button name="button" type="button" class="btn gl-button btn-confirm btn-upload-file" id="submit-all"><div class="gl-spinner gl-mr-2 js-loading-icon hidden"></div>
Replace file
</button><a class="btn gl-button btn-default btn-cancel" data-dismiss="modal" href="#">Скасувати</a>

</div>
</form></div>
</div>
</div>
</div>

</div>


</main>
</div>


</div>
</div>
<div class="top-nav-responsive layout-page content-wrapper-margin">
<div data-view-model="{&quot;primary&quot;:[{&quot;id&quot;:&quot;project&quot;,&quot;title&quot;:&quot;Проєкти&quot;,&quot;active&quot;:true,&quot;icon&quot;:&quot;project&quot;,&quot;href&quot;:&quot;&quot;,&quot;view&quot;:&quot;projects&quot;,&quot;css_class&quot;:&quot;qa-projects-dropdown&quot;,&quot;data&quot;:{&quot;track_label&quot;:&quot;projects_dropdown&quot;,&quot;track_action&quot;:&quot;click_dropdown&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;groups&quot;,&quot;title&quot;:&quot;Groups&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;group&quot;,&quot;href&quot;:&quot;&quot;,&quot;view&quot;:&quot;groups&quot;,&quot;css_class&quot;:&quot;qa-groups-dropdown&quot;,&quot;data&quot;:{&quot;track_label&quot;:&quot;groups_dropdown&quot;,&quot;track_action&quot;:&quot;click_dropdown&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;milestones&quot;,&quot;title&quot;:&quot;Milestones&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;clock&quot;,&quot;href&quot;:&quot;/dashboard/milestones&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;milestones_link&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;snippets&quot;,&quot;title&quot;:&quot;Сніпети&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;snippet&quot;,&quot;href&quot;:&quot;/dashboard/snippets&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;snippets_link&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;activity&quot;,&quot;title&quot;:&quot;Activity&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;history&quot;,&quot;href&quot;:&quot;/dashboard/activity&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;activity_link&quot;},&quot;emoji&quot;:null}],&quot;secondary&quot;:[],&quot;views&quot;:{&quot;projects&quot;:{&quot;namespace&quot;:&quot;projects&quot;,&quot;currentUserName&quot;:&quot;Kelevra&quot;,&quot;currentItem&quot;:{&quot;id&quot;:20803,&quot;name&quot;:&quot;formula1&quot;,&quot;namespace&quot;:&quot;В&#39;ячеслав / formula1&quot;,&quot;webUrl&quot;:&quot;/Kelevra/formula1&quot;,&quot;avatarUrl&quot;:null},&quot;linksPrimary&quot;:[{&quot;id&quot;:&quot;your&quot;,&quot;title&quot;:&quot;Ваші проєкти&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/projects&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Ваші проєкти&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;starred&quot;,&quot;title&quot;:&quot;Обрані проєкти&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/projects/starred&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Обрані проєкти&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;explore&quot;,&quot;title&quot;:&quot;Огляд проєктів&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/explore&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Огляд проєктів&quot;},&quot;emoji&quot;:null}],&quot;linksSecondary&quot;:[{&quot;id&quot;:&quot;create&quot;,&quot;title&quot;:&quot;Створити новий проєкт&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/projects/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Створити новий проєкт&quot;},&quot;emoji&quot;:null}]},&quot;groups&quot;:{&quot;namespace&quot;:&quot;groups&quot;,&quot;currentUserName&quot;:&quot;Kelevra&quot;,&quot;currentItem&quot;:{},&quot;linksPrimary&quot;:[{&quot;id&quot;:&quot;your&quot;,&quot;title&quot;:&quot;Ваші групи&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/groups&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Ваші групи&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;explore&quot;,&quot;title&quot;:&quot;Огляд груп&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/explore/groups&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Огляд груп&quot;},&quot;emoji&quot;:null}],&quot;linksSecondary&quot;:[{&quot;id&quot;:&quot;create&quot;,&quot;title&quot;:&quot;Створити групу&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/groups/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Створити групу&quot;},&quot;emoji&quot;:null}]},&quot;new&quot;:{&quot;title&quot;:&quot;Новий...&quot;,&quot;menu_sections&quot;:[{&quot;title&quot;:&quot;Цей проєкт&quot;,&quot;menu_items&quot;:[{&quot;id&quot;:&quot;new_issue&quot;,&quot;title&quot;:&quot;Нова задача&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/Kelevra/formula1/-/issues/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;track_action&quot;:&quot;click_link_new_issue&quot;,&quot;track_label&quot;:&quot;plus_menu_dropdown&quot;,&quot;qa_selector&quot;:&quot;new_issue_link&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;new_mr&quot;,&quot;title&quot;:&quot;Новий запит на злиття&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/Kelevra/formula1/-/merge_requests/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;track_action&quot;:&quot;click_link_new_mr&quot;,&quot;track_label&quot;:&quot;plus_menu_dropdown&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;new_snippet&quot;,&quot;title&quot;:&quot;Новий сніпет&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/Kelevra/formula1/-/snippets/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;track_action&quot;:&quot;click_link_new_snippet_project&quot;,&quot;track_label&quot;:&quot;plus_menu_dropdown&quot;},&quot;emoji&quot;:null}]},{&quot;title&quot;:&quot;GitLab&quot;,&quot;menu_items&quot;:[{&quot;id&quot;:&quot;general_new_project&quot;,&quot;title&quot;:&quot;Новий проєкт/репозиторій&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/projects/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;track_action&quot;:&quot;click_link_new_project&quot;,&quot;track_label&quot;:&quot;plus_menu_dropdown&quot;,&quot;qa_selector&quot;:&quot;global_new_project_link&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;general_new_group&quot;,&quot;title&quot;:&quot;Нова група&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/groups/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;track_action&quot;:&quot;click_link_new_group&quot;,&quot;track_label&quot;:&quot;plus_menu_dropdown&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;general_new_snippet&quot;,&quot;title&quot;:&quot;Новий сніпет&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/-/snippets/new&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;track_action&quot;:&quot;click_link_new_snippet_parent&quot;,&quot;track_label&quot;:&quot;plus_menu_dropdown&quot;,&quot;qa_selector&quot;:&quot;global_new_snippet_link&quot;},&quot;emoji&quot;:null}]}]},&quot;search&quot;:{&quot;id&quot;:&quot;search&quot;,&quot;title&quot;:&quot;Пошук&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;search&quot;,&quot;href&quot;:&quot;/search?project_id=20803&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:null,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Пошук&quot;},&quot;emoji&quot;:null}},&quot;shortcuts&quot;:[{&quot;id&quot;:&quot;project-shortcut&quot;,&quot;title&quot;:&quot;Проєкти&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/projects&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-projects&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Проєкти&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;groups-shortcut&quot;,&quot;title&quot;:&quot;Groups&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/groups&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-groups&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Groups&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;milestones-shortcut&quot;,&quot;title&quot;:&quot;Milestones&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/milestones&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-milestones&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Milestones&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;snippets-shortcut&quot;,&quot;title&quot;:&quot;Сніпети&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/snippets&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-snippets&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Сніпети&quot;},&quot;emoji&quot;:null},{&quot;id&quot;:&quot;activity-shortcut&quot;,&quot;title&quot;:&quot;Activity&quot;,&quot;active&quot;:false,&quot;icon&quot;:&quot;&quot;,&quot;href&quot;:&quot;/dashboard/activity&quot;,&quot;view&quot;:&quot;&quot;,&quot;css_class&quot;:&quot;dashboard-shortcuts-activity&quot;,&quot;data&quot;:{&quot;qa_selector&quot;:&quot;menu_item_link&quot;,&quot;qa_title&quot;:&quot;Activity&quot;},&quot;emoji&quot;:null}],&quot;activeTitle&quot;:&quot;Меню&quot;}" id="js-top-nav-responsive"></div>
</div>



<script>
//<![CDATA[
if ('loading' in HTMLImageElement.prototype) {
  document.querySelectorAll('img.lazy').forEach(img => {
    img.loading = 'lazy';
    let imgUrl = img.dataset.src;
    // Only adding width + height for avatars for now
    if (imgUrl.indexOf('/avatar/') > -1 && imgUrl.indexOf('?') === -1) {
      const targetWidth = img.getAttribute('width') || img.width;
      imgUrl += `?width=${targetWidth}`;
    }
    img.src = imgUrl;
    img.removeAttribute('data-src');
    img.classList.remove('lazy');
    img.classList.add('js-lazy-loaded', 'qa-js-lazy-loaded');
  });
}

//]]>
</script>

</body>
</html>

