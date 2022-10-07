const endPoint = "https://github.com/trending-repositories";

async function fetchTrendingRepos(endPoint) {
	/**
	 * The await expression causes async function execution to pause until
	 * a Promise is settled (that is, fulfilled or rejected), and to resume
	 * execution of the async function after fulfillment.
	 */
	return await new Promise((Resolve, Reject) => {
		console.log(`Making request to ${endPoint}`);

		if (decodeURIComponent(endPoint).includes("github.com"))
			Resolve(
				`Connection successful with ${endPoint} querying trending repositories!`
			);
		else Reject(`Can't request to domain other than github.com`);
	});
}

let count = 10;

async function processRequest(response) {
	return await new Promise((Resolve, Reject) => {
		console.log("Processing response");
		Resolve(`Got ${repositories.length} repositories from ${endPoint}`);
	});
}

// //Old way of dealing with promises
// fetchTrendingRepos(endPoint)
// 	// .then will return the resolved value of the promise
// 	.then((res) => {
// 		console.log("Response recieved");
// 		return processRequest(res);
// 	})
// 	.then((newResponse) => {
// 		console.log(newResponse);
// 	});

// async await
async function api() {
	try {
		const response = await fetchTrendingRepos(endPoint);
		console.log("Response recieved");
		const newResponse = await processRequest(response);

		let stars = 0;
		let languages = [];
		repositories.forEach((element) => {
			stars += element.totalStars;
			if (element.language && !languages.includes(element.language))
				languages.push(element.language);
		});

		console.log(
			`${newResponse} with total of ${stars} stars in languages: ${languages}!`
		);
	} catch (err) {
		console.log(err);
	}
}

api();

/**
 * Credits:: NiklasTiede / Github-Trending-API [https://github.com/NiklasTiede/Github-Trending-API]
 * endpoint = https://gh-trending-api.herokuapp.com/repositories
 */
const repositories = [
	{
		rank: 1,
		username: "libsql",
		repositoryName: "libsql",
		url: "https://github.com/libsql/libsql",
		description:
			"libSQL is a fork of SQLite that is both Open Source, and Open Contributions.",
		language: "C",
		languageColor: "#555555",
		totalStars: 862,
		forks: 20,
		starsSince: 295,
		since: "daily",
	},
	{
		rank: 2,
		username: "remoteintech",
		repositoryName: "remote-jobs",
		url: "https://github.com/remoteintech/remote-jobs",
		description:
			"A list of semi to fully remote-friendly companies (jobs) in tech.",
		language: "JavaScript",
		languageColor: "#f1e05a",
		totalStars: 20631,
		forks: 2234,
		starsSince: 346,
		since: "daily",
	},
	{
		rank: 3,
		username: "psf",
		repositoryName: "black",
		url: "https://github.com/psf/black",
		description: "The uncompromising Python code formatter",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 29517,
		forks: 1873,
		starsSince: 96,
		since: "daily",
	},
	{
		rank: 4,
		username: "facebookincubator",
		repositoryName: "AITemplate",
		url: "https://github.com/facebookincubator/AITemplate",
		description:
			"AITemplate is a Python framework which renders neural network into high performance CUDA/HIP C++ code. Specialized for FP16 TensorCore (NVIDIA GPU) and MatrixCore (AMD GPU) inference.",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 1533,
		forks: 83,
		starsSince: 179,
		since: "daily",
	},
	{
		rank: 5,
		username: "net4people",
		repositoryName: "bbs",
		url: "https://github.com/net4people/bbs",
		description: "Forum for discussing Internet censorship circumvention",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 1178,
		forks: 32,
		starsSince: 141,
		since: "daily",
	},
	{
		rank: 6,
		username: "xcad2k",
		repositoryName: "cheat-sheets",
		url: "https://github.com/xcad2k/cheat-sheets",
		description:
			"This is my personal knowledge-base. Here you'll find code-snippets, technical documentation, and command reference for various tools, and technologies.",
		language: null,
		languageColor: null,
		totalStars: 906,
		forks: 362,
		starsSince: 182,
		since: "daily",
	},
	{
		rank: 7,
		username: "snaplet",
		repositoryName: "postgres-wasm",
		url: "https://github.com/snaplet/postgres-wasm",
		description: "A PostgresQL server running in your browser",
		language: "Shell",
		languageColor: "#89e051",
		totalStars: 1231,
		forks: 29,
		starsSince: 227,
		since: "daily",
	},
	{
		rank: 8,
		username: "shubhamgrg04",
		repositoryName: "awesome-diagramming",
		url: "https://github.com/shubhamgrg04/awesome-diagramming",
		description:
			"A curated collection of diagramming tools used by leading software engineering teams",
		language: null,
		languageColor: null,
		totalStars: 985,
		forks: 22,
		starsSince: 339,
		since: "daily",
	},
	{
		rank: 9,
		username: "deepset-ai",
		repositoryName: "haystack",
		url: "https://github.com/deepset-ai/haystack",
		description:
			"🔍Haystack is an open source NLP framework that leverages pre-trained Transformer models. It enables developers to quickly implement production-ready semantic search, question answering, summarization and document ranking for a wide range of NLP applications.",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 5708,
		forks: 902,
		starsSince: 129,
		since: "daily",
	},
	{
		rank: 10,
		username: "palera1n",
		repositoryName: "palera1n",
		url: "https://github.com/palera1n/palera1n",
		description:
			'iOS 15.0-15.3.1 tethered checkm8 "jailbreak" (rootless is 15.0-15.7 semi-tethered, no tweaks)',
		language: "Shell",
		languageColor: "#89e051",
		totalStars: 382,
		forks: 43,
		starsSince: 61,
		since: "daily",
	},
	{
		rank: 11,
		username: "SecureAuthCorp",
		repositoryName: "impacket",
		url: "https://github.com/SecureAuthCorp/impacket",
		description:
			"Impacket is a collection of Python classes for working with network protocols.",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 9843,
		forks: 2858,
		starsSince: 80,
		since: "daily",
	},
	{
		rank: 12,
		username: "pola-rs",
		repositoryName: "polars",
		url: "https://github.com/pola-rs/polars",
		description:
			"Fast multi-threaded DataFrame library in Rust | Python | Node.js",
		language: "Rust",
		languageColor: "#dea584",
		totalStars: 8311,
		forks: 463,
		starsSince: 100,
		since: "daily",
	},
	{
		rank: 13,
		username: "sourcegraph",
		repositoryName: "sourcegraph",
		url: "https://github.com/sourcegraph/sourcegraph",
		description: "Universal code search (self-hosted)",
		language: "Go",
		languageColor: "#00ADD8",
		totalStars: 6844,
		forks: 836,
		starsSince: 123,
		since: "daily",
	},
	{
		rank: 14,
		username: "public-apis",
		repositoryName: "public-apis",
		url: "https://github.com/public-apis/public-apis",
		description: "A collective list of free APIs",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 211324,
		forks: 24174,
		starsSince: 302,
		since: "daily",
	},
	{
		rank: 15,
		username: "sqlfluff",
		repositoryName: "sqlfluff",
		url: "https://github.com/sqlfluff/sqlfluff",
		description: "A SQL linter and auto-formatter for Humans",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 4995,
		forks: 375,
		starsSince: 149,
		since: "daily",
	},
	{
		rank: 16,
		username: "huggingface",
		repositoryName: "datasets",
		url: "https://github.com/huggingface/datasets",
		description:
			"🤗The largest hub of ready-to-use datasets for ML models with fast, easy-to-use and efficient data manipulation tools",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 14387,
		forks: 1866,
		starsSince: 171,
		since: "daily",
	},
	{
		rank: 17,
		username: "nvm-sh",
		repositoryName: "nvm",
		url: "https://github.com/nvm-sh/nvm",
		description:
			"Node Version Manager - POSIX-compliant bash script to manage multiple active node.js versions",
		language: "Shell",
		languageColor: "#89e051",
		totalStars: 61374,
		forks: 6519,
		starsSince: 46,
		since: "daily",
	},
	{
		rank: 18,
		username: "gradio-app",
		repositoryName: "gradio",
		url: "https://github.com/gradio-app/gradio",
		description:
			"Create UIs for your machine learning model in Python in 3 minutes",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 9676,
		forks: 606,
		starsSince: 138,
		since: "daily",
	},
	{
		rank: 19,
		username: "helm",
		repositoryName: "helm",
		url: "https://github.com/helm/helm",
		description: "The Kubernetes Package Manager",
		language: "Go",
		languageColor: "#00ADD8",
		totalStars: 22768,
		forks: 6399,
		starsSince: 68,
		since: "daily",
	},
	{
		rank: 20,
		username: "wagtail",
		repositoryName: "wagtail",
		url: "https://github.com/wagtail/wagtail",
		description:
			"A Django content management system focused on flexibility and user experience",
		language: "Python",
		languageColor: "#3572A5",
		totalStars: 12881,
		forks: 2769,
		starsSince: 78,
		since: "daily",
	},
	{
		rank: 21,
		username: "microsoft",
		repositoryName: "PowerToys",
		url: "https://github.com/microsoft/PowerToys",
		description: "Windows system utilities to maximize productivity",
		language: "C#",
		languageColor: "#178600",
		totalStars: 79526,
		forks: 4537,
		starsSince: 189,
		since: "daily",
	},
	{
		rank: 22,
		username: "copy",
		repositoryName: "v86",
		url: "https://github.com/copy/v86",
		description:
			"x86 virtualization in your browser, recompiling x86 to wasm on the fly",
		language: "JavaScript",
		languageColor: "#f1e05a",
		totalStars: 16142,
		forks: 1162,
		starsSince: 174,
		since: "daily",
	},
	{
		rank: 23,
		username: "torvalds",
		repositoryName: "linux",
		url: "https://github.com/torvalds/linux",
		description: "Linux kernel source tree",
		language: "C",
		languageColor: "#555555",
		totalStars: 139300,
		forks: 44939,
		starsSince: 169,
		since: "daily",
	},
	{
		rank: 24,
		username: "zhanwen",
		repositoryName: "MathModel",
		url: "https://github.com/zhanwen/MathModel",
		description:
			"研究生数学建模，本科生数学建模、数学建模竞赛优秀论文，数学建模算法，LaTeX论文模板，算法思维导图，参考书籍，Matlab软件教程，PPT",
		language: "TeX",
		languageColor: "#3D6117",
		totalStars: 4988,
		forks: 1729,
		starsSince: 54,
		since: "daily",
	},
	{
		rank: 25,
		username: "community",
		repositoryName: "community",
		url: "https://github.com/community/community",
		description:
			"Public feedback discussions for: GitHub Mobile, GitHub Discussions, GitHub Codespaces, GitHub Sponsors, GitHub Issues and more!",
		language: null,
		languageColor: null,
		totalStars: 4365,
		forks: 1489,
		starsSince: 50,
		since: "daily",
	},
];
